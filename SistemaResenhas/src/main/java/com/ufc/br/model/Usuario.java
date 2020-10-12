package com.ufc.br.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity
public class Usuario{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String login;
	
	
	@NotNull
	private String nome;
	
	
	@NotNull
	private String senha;



	public Usuario(Long id, @NotNull String login, @NotNull String nome, @NotNull String senha) {
		super();
		this.id = id;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + "]";
	}

	
	
	
}
