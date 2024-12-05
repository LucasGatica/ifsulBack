package com.ifsul.innovators.controller;

import com.ifsul.innovators.model.Projeto;
import com.ifsul.innovators.service.ProjetoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projetos")
@AllArgsConstructor
public class ProjetoController {

    private final ProjetoService projetoService;

    @PostMapping
    public Projeto salvarProjeto(@RequestBody Projeto projeto) {
        return projetoService.salvarProjeto(projeto);
    }

    @GetMapping
    public List<Projeto> listarProjetos() {return projetoService.findAll();}

    @GetMapping("/{id}")
    public Optional<Projeto> buscarProjetoPorId(@PathVariable Long id) {return projetoService.findById(id);}

    @DeleteMapping("/{id}")
    public void removerProjeto(@PathVariable Long id) {projetoService.delete(id);}
}