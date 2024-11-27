package com.nics.loja.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_avaliacao")
public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "classificacao")
	private int classificacao;

	@Column(name = "comentario")
	private String comentario;
	
	@ManyToOne
	@JoinColumn(name = "pk_usuairo")
	private Usuario usuario;

	public Avaliacao() {
	}

	public Avaliacao(Long id, int classificacao, String comentario, Usuario usuario) {
		this.id = id;
		this.usuario = usuario;
		this.classificacao = classificacao;
		this.comentario = comentario;
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
	
	public int getclassificacao() {
		return classificacao;
	}

	public void setclassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}