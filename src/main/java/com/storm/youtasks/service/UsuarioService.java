package com.storm.youtasks.service;

import com.storm.youtasks.domain.model.Usuario;

public interface UsuarioService {
    
    Usuario findById(Long id);
    Usuario registrarUsuario(Usuario usuarioACriar);
}
