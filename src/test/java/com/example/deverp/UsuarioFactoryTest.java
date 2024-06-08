package com.example.deverp;

import com.example.deverp.dtos.UsuarioDTO;
import com.example.deverp.entity.UsuarioEntity;
import com.example.deverp.factories.UsuarioFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsuarioFactoryTest {

    @Autowired
    private UsuarioFactory usuarioFactory;

    @Test
    public void testCriarUsuarioComParametros() {
        UsuarioEntity usuario = usuarioFactory.criarUsuario("John Doe", "johndoe", "senha123", "johndoe@example.com");
        Assertions.assertNotNull(usuario);
        Assertions.assertEquals("John Doe", usuario.getNome());
        Assertions.assertEquals("johndoe", usuario.getLogin());
        Assertions.assertEquals("senha123", usuario.getSenha());
        Assertions.assertEquals("johndoe@example.com", usuario.getEmail());
    }

    @Test
    public void testCriarUsuarioComDTO() {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNome("Jane Doe");
        usuarioDTO.setLogin("janedoe");
        usuarioDTO.setSenha("senha456");
        usuarioDTO.setEmail("janedoe@example.com");

        UsuarioEntity usuario = usuarioFactory.criarUsuario(usuarioDTO);
        Assertions.assertNotNull(usuario);
        Assertions.assertEquals("Jane Doe", usuario.getNome());
        Assertions.assertEquals("janedoe", usuario.getLogin());
        Assertions.assertEquals("senha456", usuario.getSenha());
        Assertions.assertEquals("janedoe@example.com", usuario.getEmail());
    }
}
