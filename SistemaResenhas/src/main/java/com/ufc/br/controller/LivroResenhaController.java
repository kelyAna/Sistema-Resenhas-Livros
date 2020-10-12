package com.ufc.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.br.model.LivroResenha;
import com.ufc.br.service.LivroResenhaService;


@Controller
public class LivroResenhaController {
	
	@Autowired
	private LivroResenhaService livroService;

	@RequestMapping("/formulario")
	public String form() {
		return "formulario-cadastro";
	}
	
	@RequestMapping("/salvar")
	public String salvarLivro(LivroResenha livro) {
		if((livro.getTitulo().isEmpty()) || (livro.getAutor().isEmpty()) || (livro.getGenero().isEmpty()) || (livro.getResenha().isEmpty())) {
			return "formulario-cadastro";
		}
		
		livroService.cadastrar(livro);
		
		return "pagina-inicial";
	}
	
	@RequestMapping("/listar")
	public ModelAndView listar() {
		List<LivroResenha> livros = livroService.listarLivros();
		ModelAndView mv = new ModelAndView("listagem");
		mv.addObject("listaDeLivros", livros);
		
		return mv;
	}
}
 