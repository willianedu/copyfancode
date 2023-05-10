package com.copyfan.apicopyfan.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class CarrinhoDeCompras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Boolean ativo;
	private String produto;
	private Integer quantidade;
	private Double vlrTotal;
	
	
	public CarrinhoDeCompras() {
	}
	public CarrinhoDeCompras(Long id, String produto, Integer quantidade, Double vlrTotal) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.vlrTotal = vlrTotal;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(Double vlrTotal) {this.vlrTotal = vlrTotal;}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean aitvo) {this.ativo=ativo;}
	
	public void inserirProduto() {
		
	}
	public void removerProduto() {
		
	}
}