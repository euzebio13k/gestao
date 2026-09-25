package com.ifto.gestao_custos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifto.gestao_custos.model.Despesa;
import com.ifto.gestao_custos.repository.DespesaRepository;

@RequestMapping("/gestao") 
@RestController 
public class GestaoDespesaController {
    @Autowired 
    DespesaRepository despesaRepository; 
        
    @PostMapping("/create") 
    public void create(@RequestBody Despesa despesa){
        despesaRepository.save(despesa);
    }
}
