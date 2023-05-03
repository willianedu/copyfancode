package com.copyfan.apicopyfan.model;


import java.util.Date;

public class Pedido {
	
	private Cliente cliente;
	private Double vlrTotal;
	private Boolean pago;
	private Date  dataPedido;
	
	public Pedido() {
	}
	public Pedido(Cliente cliente, Double vlrTotal, Boolean pago, Date dataPedido) {
		this.cliente = cliente;
		this.vlrTotal = vlrTotal;
		this.pago = pago;
		this.dataPedido = dataPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	public Boolean getPago() {
		return pago;
	}
	public void setPago(Boolean pago) {
		this.pago = pago;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
}