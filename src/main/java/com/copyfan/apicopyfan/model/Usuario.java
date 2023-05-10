package com.copyfan.apicopyfan.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Boolean ativo;
	private String senha;
	private String nome;
	private String email;
	private String matricula;

	public Usuario() {
	}
	public Usuario(String senha, String nome, String email, String matricula) {
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean aitvo) {this.ativo=ativo;}
	public Long getId(){return id;}
	public void setId(Long id) {this.id=id;}

	public void cadastro(String email, String senha,String matricula, String nome) {

	}


	public void logar(String email, String senha) {

	}
}