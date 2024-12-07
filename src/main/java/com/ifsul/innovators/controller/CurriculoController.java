package com.ifsul.innovators.controller;

import com.ifsul.innovators.model.Curriculo;
import com.ifsul.innovators.service.CurriculoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
@AllArgsConstructor
public class CurriculoController {

    private final CurriculoService curriculoService;


    @PostMapping
    public Curriculo salvarCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoService.salvarCurriculo(curriculo);
    }


    @GetMapping
    public List<Curriculo> listarCurriculos() {
        return curriculoService.buscarTodos();
    }


    @GetMapping("/{id}")
    public Curriculo buscarCurriculoPorId(@PathVariable Long id) {
        return curriculoService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Currículo não encontrado com o ID: " + id));
    }


    @PutMapping("/{id}")
    public Curriculo atualizarCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculoAtualizado) {
        return curriculoService.atualizarCurriculo(id, curriculoAtualizado);
    }


    @DeleteMapping("/{id}")
    public void removeCurriculo(@PathVariable Long id) {
        curriculoService.deletarCurriculo(id);
    }
}
