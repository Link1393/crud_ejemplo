package com.example.crud_ejemplo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_ejemplo.models.UsuarioModel;
import com.example.crud_ejemplo.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ArrayList<UsuarioModel> getUsuarios() {
        return this.usuarioService.getUsuarios();
    }

    @PostMapping
    public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario) {
        return this.saveUsuario(usuario);
    }
}
