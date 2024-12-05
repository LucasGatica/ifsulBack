package com.ifsul.innovators.repository;

import com.ifsul.innovators.enums.StatusTipo;
import com.ifsul.innovators.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    Optional<List<Projeto>> findByStatusTipo(StatusTipo statusTipo);

}