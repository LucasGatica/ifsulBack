package com.ifsul.innovators.service;

import com.ifsul.innovators.model.Necessidade;
import com.ifsul.innovators.repository.NecessidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NecessidadeService {

    private final NecessidadeRepository necessidadeRepository;

    public Necessidade salvarNecessidade(Necessidade necessidade) {
        return necessidadeRepository.save(necessidade);
    }

    public List<Necessidade> findAll() {
        return necessidadeRepository.findAll();
    }

    public Necessidade findById(Long id) {
        return necessidadeRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        Necessidade necessidadeParaExcluir = necessidadeRepository.findById(id).orElseThrow();
        necessidadeRepository.delete(necessidadeParaExcluir);
    }
}