package com.ifto.gestao_custos.useCases;

import com.ifto.gestao_custos.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifto.gestao_custos.entity.Despesa;
@Service 
public class CadastroDespesaUseCase {
    
    @Autowired 
    private DespesaRepository despesaRepository;
    public void execute(Despesa despesa){
        System.out.println("Despesa: " + despesa.toString());
        despesa = despesaRepository.save(despesa);
        System.out.println("Despesa: " + despesa.toString());

    }
}
