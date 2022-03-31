package com.example.apirest.repositories;

import org.springframework.stereotype.Repository;

import com.example.apirest.models.usuarioModel;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface usuarioRepository extends CrudRepository<usuarioModel, Long>{

}
