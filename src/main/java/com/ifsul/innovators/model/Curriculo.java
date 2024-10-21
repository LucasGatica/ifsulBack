package com.ifsul.innovators.model;

import java.time.LocalDateTime;
import java.util.List;

public class Curriculo {

    private String idCurriculo;
    private String idUsuario;
    private List<String> listaSkills;
    private List<String> listaIdsExperiencias;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
}
