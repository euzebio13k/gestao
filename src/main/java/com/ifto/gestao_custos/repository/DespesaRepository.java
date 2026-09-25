package com.ifto.gestao_custos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifto.gestao_custos.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

}
