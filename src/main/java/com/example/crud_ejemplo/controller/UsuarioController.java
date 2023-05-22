package com.example.crud_ejemplo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        return this.usuarioService.saveUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getUsuarioById(@PathVariable("id") Long id) {
        return this.usuarioService.getUsuarioById(id);
    }

    @GetMapping("/querycedula")
    public ArrayList<UsuarioModel> getUsuarioByCedula(@RequestParam("cedula") String cedula) {
        return this.usuarioService.getUsuarioByCedula(cedula);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUsuario(@PathVariable("id") Long id) {
        boolean success = this.usuarioService.deleteUsuario(id);
        if (success) {
            return "Se eliminó el usuario con Id " + id;
        } else {
            return "No fue posible elimiar el usuario con id " + id;
        }
    }
}
