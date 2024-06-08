package com.example.deverp.controllers;

import com.example.deverp.dtos.UsuarioDTO;
import com.example.deverp.entity.UsuarioEntity;
import com.example.deverp.repositorys.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String usuario() {
        return "usuario";
    }

    @GetMapping("/lista_usuario")
    public String listarUsuarios(Model model) {
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "lista_usuario";
    }

    @GetMapping("/new")
    public String paginaCadastrarUsuario(Model model) {
        model.addAttribute("usuario", new UsuarioDTO());
        return "cadastrar_usuario";
    }

    @PostMapping("/new")
    public String inserir(@Valid @ModelAttribute("usuario") UsuarioDTO usuario, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "cadastrar_usuario";
        }
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
        usuarioRepository.save(usuarioEntity);
        redirectAttributes.addFlashAttribute("sucesso", true);
        return "redirect:/usuario/new";
    }
}