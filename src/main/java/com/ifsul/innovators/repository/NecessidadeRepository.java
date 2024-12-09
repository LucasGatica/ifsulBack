package com.ifsul.innovators.repository;

import com.ifsul.innovators.model.Necessidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NecessidadeRepository extends JpaRepository<Necessidade, Long> { }