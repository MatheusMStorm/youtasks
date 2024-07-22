package com.storm.youtasks.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.storm.youtasks.domain.model.Usuario;
import com.storm.youtasks.domain.repository.UsuarioRepository;
import com.storm.youtasks.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario registrarUsuario(Usuario usuarioACriar) {
        if(usuarioACriar.getId() != null && usuarioRepository.existsById(usuarioACriar.getId())) {
            throw new IllegalArgumentException("Este usuário já existe.");
        }
        return usuarioRepository.save(usuarioACriar);
    }
    
}
