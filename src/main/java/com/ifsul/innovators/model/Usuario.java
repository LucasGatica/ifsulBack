package com.ifsul.innovators.model;

import java.time.LocalDateTime;
import java.util.List;

public class Usuario {
    private String id;
    private String nome;
    private String fotoDePerfilURL;
    private String idCurriculo;
    private List<String > idsProjetos;
    private com.ifsul.innovators.enums.UsuarioTipo UsuarioTipo;
    private String matricula;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;


}
