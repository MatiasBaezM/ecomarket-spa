package com.ecomarket_spa.ecomarket.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomarket_spa.ecomarket.model.Auth;
import com.ecomarket_spa.ecomarket.model.Usuario;
import com.ecomarket_spa.ecomarket.repository.UsuarioRepository;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean login(Auth Auth) {
        Optional<Usuario> optUsuario = usuarioRepository.findByEmail(Auth.getEmail());

        if (optUsuario.isPresent()) {
            Usuario usuario = optUsuario.get();
            return usuario.getClave().equals(Auth.getClave());
        } else {
            return false;
        }
    }
}

