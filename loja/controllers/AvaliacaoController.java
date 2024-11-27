package com.nics.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nics.loja.entities.Avaliacao;
import com.nics.loja.services.AvaliacaoService;
import java.util.List;

@RestController
@RequestMapping("/Avaliacao")
@CrossOrigin(origins = "http://localhost:8080") // Permite a comunicação com o frontend
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    // Endpoint para criar uma nova avaliação
    @PostMapping
    public ResponseEntity<Avaliacao> criarAvaliacao(@RequestBody Avaliacao avaliacao) {
        Avaliacao novaAvaliacao = avaliacaoService.salvarAvaliacao(avaliacao);
        return ResponseEntity.ok(novaAvaliacao);
    }

    // Endpoint para buscar todas as avaliações
    @GetMapping
    public ResponseEntity<List<Avaliacao>> listarAvaliacoes() {
        List<Avaliacao> avaliacoes = avaliacaoService.buscarTodas();
        return ResponseEntity.ok(avaliacoes);
    }
}
