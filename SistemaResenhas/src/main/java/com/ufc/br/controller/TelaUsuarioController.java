package com.ufc.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TelaUsuarioController {
	
	@RequestMapping("/telausurio")
	public String telaUsuario() {
		return "TelaUsuario";
	}

}
