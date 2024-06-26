package com.ApiExample.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ApiExample.demo.models.UsuarioModel;
import java.util.List;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>{

    public abstract ArrayList<UsuarioModel>  findByPrioridad(Integer prioridad);
    
} 