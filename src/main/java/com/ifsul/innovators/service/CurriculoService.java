package com.ifsul.innovators.service;

import com.ifsul.innovators.model.Curriculo;
import com.ifsul.innovators.repository.CurriculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CurriculoService {
    private final CurriculoRepository curriculoRepository;


    public Curriculo salvarCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }


    public List<Curriculo> buscarTodos() {
        return curriculoRepository.findAll();
    }


    public Optional<Curriculo> buscarPorId(Long id) {
        return curriculoRepository.findById(id);
    }


    public Curriculo atualizarCurriculo(Long id, Curriculo curriculoAtualizado) {
        Curriculo curriculoExistente = curriculoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Currículo não encontrado."));
        curriculoExistente.setNome(curriculoAtualizado.getNome());
        curriculoExistente.setDescricao(curriculoAtualizado.getDescricao());

        return curriculoRepository.save(curriculoExistente);
    }


    public void deletarCurriculo(Long id) {
        Curriculo curriculo = curriculoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Currículo não encontrado."));
        curriculoRepository.delete(curriculo);
    }
}
