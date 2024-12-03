package com.ifsul.innovators.model;

import com.ifsul.innovators.enums.ExperienciaTipo;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperiencia;
    @ManyToOne
    @JoinColumn(name = "id_curriculo")
    private Curriculo curriculo;
    private String titulo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private ExperienciaTipo experienciaTipo;
}

