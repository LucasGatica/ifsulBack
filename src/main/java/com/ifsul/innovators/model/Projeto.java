package com.ifsul.innovators.model;

import com.ifsul.innovators.enums.StatusTipo;

import java.time.LocalDateTime;
import java.util.List;

public class Projeto {

    private String idProjeto;
    private String idUsuario;
    private String nome;
    private String descricao;
    private String nomeAutor;
    private List<String> listaIdNecessidades;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    private LocalDateTime dataEstimadaTermino;
    private StatusTipo statusTipo;
}
