package com.ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;


@Entity
public class LivroResenha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String titulo;
	
	@NotNull
	private String autor;
	
	@NotNull
	private String genero;
	
	@NotNull
	private String resenha;

	public LivroResenha(Long id, String titulo, String autor, String genero, String resenha) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.resenha = resenha;
	}

	public LivroResenha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getResenha() {
		return resenha;
	}

	public void setResenha(String resenha) {
		this.resenha = resenha;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", resenha="
				+ resenha + "]";
	}

	
	
	
}

