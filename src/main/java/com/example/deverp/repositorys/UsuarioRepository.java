package com.example.deverp.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.deverp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {}
