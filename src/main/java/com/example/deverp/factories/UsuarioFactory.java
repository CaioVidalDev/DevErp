package com.example.deverp.factories;

import com.example.deverp.dtos.UsuarioDTO;
import com.example.deverp.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UsuarioFactory {

    public UsuarioEntity criarUsuario(String nome, String login, String senha, String email) {
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setSenha(senha);
        usuario.setEmail(email);
        return usuario;
    }

    public UsuarioEntity criarUsuario(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setLogin(usuarioDTO.getLogin());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setEmail(usuarioDTO.getEmail());
        return usuario;
    }
}

