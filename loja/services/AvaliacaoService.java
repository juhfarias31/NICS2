package com.nics.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nics.loja.entities.Avaliacao;
import com.nics.loja.repositories.AvaliacaoRepository;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    // Salva uma nova avaliação
    public Avaliacao salvarAvaliacao(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    // Retorna todas as avaliações
    public List<Avaliacao> buscarTodas() {
        return avaliacaoRepository.findAll();
    }
}