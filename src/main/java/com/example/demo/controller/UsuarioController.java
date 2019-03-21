package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.model.Usuario;

@Controller
public class UsuarioController {
	
	
	@Autowired
	UsuarioDAO usuarioDAO;
	
	
	
	@RequestMapping("/usuarios/new")
	public String save(Usuario usuario){
		usuarioDAO.save(usuario);
		return "Usuario Criado";
	}

	
	@RequestMapping("/usuarios/form")
	public String form(){
		return "cadastroUsuario";
	}
	
}
