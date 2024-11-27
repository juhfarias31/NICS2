package com.nics.loja.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valorTotal")
	private String valorTotal;
	
	@Column(name = "dt_pedido")
	private Date dt_pedido;
	
	@Column(name = "prazo")
	private String prazo;
	
	@ManyToOne
	@JoinColumn(name = "pk_usuairo")
	private Usuario usuario;

	public Pedido() {
	}

	public Pedido(Long id, String valorTotal, Date dt_pedido, String prazo, Usuario usuario) {
		this.id = id;
		this.usuario = usuario;
		this.valorTotal = valorTotal;
		this.dt_pedido = dt_pedido;
		this.prazo = prazo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Date getDt_pedido() {
		return dt_pedido;
	}

	public void setDt_pedido(Date dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}


}
