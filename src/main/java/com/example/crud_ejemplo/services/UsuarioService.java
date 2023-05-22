package com.example.crud_ejemplo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_ejemplo.models.UsuarioModel;
import com.example.crud_ejemplo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios() {
        return (ArrayList<UsuarioModel>) this.usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> getUsuarioById(Long id) {
        return this.usuarioRepository.findById(id);
    }

    
}
