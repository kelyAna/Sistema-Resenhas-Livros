package com.ufc.br.controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.br.model.LivroResenha;
import com.ufc.br.model.Usuario;
import com.ufc.br.service.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	

	@PersistenceContext
	private EntityManager entityManager;

	
	@RequestMapping("/cad")
	public String formCadastro() {
		return "CadastroUsuario";
	}
	
	@RequestMapping("/salvarUsuario")
	public String salvarUsuario(Usuario usuario) {
			if((usuario.getSenha().isEmpty()) || (usuario.getNome().isEmpty()) || (usuario.getLogin().isEmpty())) {
				return "CadastroUsuario";
			}
			usuarioService.cadastrar(usuario);
			
			return "TelaUsuario";
		
		
	}
	
	@RequestMapping("/logar")
	public String logar(Usuario usuario) {
		
		List<Usuario> usuarios = usuarioService.listarUsuarios();
		
		    if(usuarios.contains(usuario)) {
					return "TelaUsuario";
			}
				
			
			return "login";
	 
	}
	
	
}
