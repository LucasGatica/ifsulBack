package com.ifsul.innovators.controller;

import com.ifsul.innovators.model.Necessidade;
import com.ifsul.innovators.service.NecessidadeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/necessidades")
@AllArgsConstructor
public class NecessidadeController {

    private final NecessidadeService necessidadeService;

    @PostMapping
    public Necessidade salvarNecessidade(@RequestBody Necessidade necessidade) {
        return necessidadeService.salvarNecessidade(necessidade);
    }

    @GetMapping
    public List<Necessidade> listarNecessidades() {
        return necessidadeService.findAll();
    }

    @GetMapping("/{id}")
    public Necessidade buscarNecessidadePorId(@PathVariable Long id) {
        return necessidadeService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void removeNecessidade(@PathVariable Long id) {
        necessidadeService.delete(id);
    }
}
