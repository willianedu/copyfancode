package com.copyfan.apicopyfan.model;

public class Administrador {
	
	private String matricula;
	private String cpf;
	
	
	public Administrador() {
		
	}
	public Administrador(String matricula, String cpf) {
		this.matricula = matricula;
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void aceitarPedidos() {
		
	}
	public void editarProduto() {
		
	}
	public void visualizarUsuarios() {
		
	}
}