package com.ifsul.innovators.service;

import com.ifsul.innovators.exceptions.EmailsException;
import com.ifsul.innovators.exceptions.SenhasExcepion;
import com.ifsul.innovators.model.Usuario;
import com.ifsul.innovators.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private PasswordEncoder passwordEncoder;

    public Usuario salvarUsuario(Usuario usuario) {
        emailValidations(usuario.getEmail());
        senhaValidations(usuario.getSenha());
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        Usuario usuarioParaExcluir = usuarioRepository.findById(id)
                .orElseThrow();
        usuarioRepository.delete(usuarioParaExcluir);
    }

    private void senhaValidations(String senha){
        if(senha.length()<=8){
            throw new SenhasExcepion("Coloque uma senha com tamanho maior que 8");
        }
    }

    private void emailValidations(String email){
        boolean present = usuarioRepository.findByEmail(email).isPresent();
        if(present){
            throw new EmailsException("O email já está cadastrado");
        }
    }
}
