package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.br.model.LivroResenha;
import com.ufc.br.repository.LivroResenhaRepository;


@Service
public class LivroService {
	
	@Autowired
	private LivroResenhaRepository livroRepository;
	
	
	public void cadastrar(LivroResenha livro) {
		
		livroRepository.save(livro);

	}
	
	public List<LivroResenha> listarLivros(){
		return livroRepository.findAll();
	}
	
	
	
}
