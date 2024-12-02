package com.ifsul.innovators.model;

import java.time.LocalDateTime;
import java.util.List;
import com.ifsul.innovators.enums.UsuarioTipo;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Data
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String fotoDePerfilURL;
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Curriculo curriculo;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Projeto> projetosCriados;

    @ManyToMany(mappedBy = "membros")
    private List<Projeto> projetosParticipados;

    @Enumerated(EnumType.STRING)
    private UsuarioTipo usuarioTipo;
    private String matricula;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}