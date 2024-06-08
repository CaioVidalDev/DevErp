package com.example.deverp.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.deverp.entity.UsuarioEntity;
import com.example.deverp.repositorys.UsuarioRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        // Inserir dados de exemplo no banco de dados
        UsuarioEntity usuario1 = new UsuarioEntity();
        usuario1.setNome("John Doe");
        usuario1.setLogin("john_doe");
        usuario1.setSenha("senha123");
        usuario1.setEmail("john@example.com");
        usuarioRepository.save(usuario1);

        UsuarioEntity usuario2 = new UsuarioEntity();
        usuario2.setNome("Jane Smith");
        usuario2.setLogin("jane_smith");
        usuario2.setSenha("senha456");
        usuario2.setEmail("jane@example.com");
        usuarioRepository.save(usuario2);
    }
}
