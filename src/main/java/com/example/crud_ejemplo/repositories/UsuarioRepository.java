package com.example.crud_ejemplo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.crud_ejemplo.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    
    public abstract ArrayList<UsuarioModel> findByCedula(String cedula);

    @Query(value = "select u from UsuarioModel u where u.nombre like %:searchParameter% " 
    + "or u.apellido like %:searchParameter% or u.cedula like %:searchParameter% "
    + "or u.correo like %:searchParameter% or u.telefono like %:searchParameter%")
    public abstract ArrayList<UsuarioModel> findBySearchString(@Param("searchParameter") String searchParameter);

}
