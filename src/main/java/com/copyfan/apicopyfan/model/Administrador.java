package com.copyfan.apicopyfan.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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