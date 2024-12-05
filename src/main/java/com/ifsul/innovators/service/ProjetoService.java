package com.ifsul.innovators.service;
import com.ifsul.innovators.model.Projeto;
import com.ifsul.innovators.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto salvarProjeto(Projeto projeto) { return projetoRepository.save(projeto);
    }

    public List<Projeto> findAll() { return projetoRepository.findAll();
    }

    public Optional<Projeto> findById(Long id) { return projetoRepository.findById(id);
    }
    public void delete(Long id) {
        if (projetoRepository.existsById(id)) {
            projetoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Projeto não encontrado");
        }
    }
}