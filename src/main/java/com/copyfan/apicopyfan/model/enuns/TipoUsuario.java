package com.copyfan.apicopyfan.model.enuns;


public enum TipoUsuario {
	Aluno,
	Professor,
	Administrador;
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}