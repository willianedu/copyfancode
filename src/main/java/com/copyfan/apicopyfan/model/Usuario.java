package com.copyfan.apicopyfan.model;

public class Usuario {
	
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
	
	public void cadastro(String email, String senha,String matricula, String nome) {
		
	}
	
    public void logar(String email, String senha) {
		
	}
}