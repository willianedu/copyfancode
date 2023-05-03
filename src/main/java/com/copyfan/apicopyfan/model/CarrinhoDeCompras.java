package com.copyfan.apicopyfan.model;


public class CarrinhoDeCompras {
	private Integer id;
	private String produto;
	private Integer quantidade;
	private Double vlrTotal;
	
	
	public CarrinhoDeCompras() {
	}
	public CarrinhoDeCompras(Integer id, String produto, Integer quantidade, Double vlrTotal) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.vlrTotal = vlrTotal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public void setVlrTotal(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	
	public void inserirProduto() {
		
	}
	public void removerProduto() {
		
	}
}