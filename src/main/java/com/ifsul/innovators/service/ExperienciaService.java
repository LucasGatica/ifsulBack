package com.ifsul.innovators.service;

import com.ifsul.innovators.model.Experiencia;
import com.ifsul.innovators.repository.ExperienciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExperienciaService {

    private final ExperienciaRepository experienciaRepository;

    public Experiencia salvarExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    public List<Experiencia> findAll() {
        return experienciaRepository.findAll();
    }

    public Experiencia findById(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        Experiencia experienciaParaExcluir = experienciaRepository.findById(id)
                .orElseThrow();
        experienciaRepository.delete(experienciaParaExcluir);
    }
}
