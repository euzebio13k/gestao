package com.ifto.gestao_custos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifto.gestao_custos.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);
}
