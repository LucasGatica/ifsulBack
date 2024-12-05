package com.ifsul.innovators.service;
import com.ifsul.innovators.enums.StatusTipo;
import com.ifsul.innovators.model.Projeto;
import com.ifsul.innovators.model.Usuario;
import com.ifsul.innovators.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjetoService {
    private ProjetoRepository projetoRepository;

    public Projeto salvarProjeto(Projeto projeto) { return projetoRepository.save(projeto);
    }

    public List<Projeto> findAll() { return projetoRepository.findAll();
    }

    public Optional<Projeto> findById(Long id) { return projetoRepository.findById(id);
    }

    public List<Projeto> findByStatusTipo(StatusTipo statusTipo) {
        return projetoRepository.findByStatusTipo(statusTipo).orElse(null);
    }

        public void delete(Long id) {
        Projeto projetoParaExcluir = projetoRepository.findById(id)
                .orElseThrow();
        projetoRepository.delete(projetoParaExcluir);
    }
}