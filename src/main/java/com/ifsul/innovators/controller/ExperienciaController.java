package com.ifsul.innovators.controller;

import com.ifsul.innovators.model.Experiencia;
import com.ifsul.innovators.service.ExperienciaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencias")
@AllArgsConstructor
public class ExperienciaController {

    private final ExperienciaService experienciaService;

    @PostMapping
    public Experiencia salvarExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaService.salvarExperiencia(experiencia);
    }

    @GetMapping
    public List<Experiencia> listarExperiencias() {
        return experienciaService.findAll();
    }

    @GetMapping("/{id}")
    public Experiencia buscarExperienciaPorId(@PathVariable Long id) {
        return experienciaService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void removeExperiencia(@PathVariable Long id) {
        experienciaService.delete(id);
    }
}
