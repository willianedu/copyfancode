package com.copyfan.apicopyfan.model;
public class Aluno {
	
	private String matricula;
	private String cpf;
	private String curso;
	private Byte arquivo;
	
	public Aluno() {
	}
	public Aluno(String matricula, String cpf, String curso, Byte arquivo) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.curso = curso;
		this.arquivo = arquivo;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Byte getArquivo() {
		return arquivo;
	}
	public void setArquivo(Byte arquivo) {
		this.arquivo = arquivo;
	}
	public void pedirArquivo() {
		
	}
	public void enviarArquivo() {
		
	}
}