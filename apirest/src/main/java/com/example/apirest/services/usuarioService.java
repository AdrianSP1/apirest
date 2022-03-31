package com.example.apirest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apirest.models.usuarioModel;
import com.example.apirest.repositories.usuarioRepository;

@Service
public class usuarioService {
	@Autowired
	usuarioRepository UsuarioRepository;
	
	public ArrayList<usuarioModel> obtenerUsuario(){
		return (ArrayList<usuarioModel>) UsuarioRepository.findAll();
	}

}
