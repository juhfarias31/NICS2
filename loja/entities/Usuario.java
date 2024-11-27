package com.nics.loja.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dt_nasc")
	private Date dt_nasc;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "senha")
	private String senha;

	public Usuario() {
	}

	public Usuario(Long id, String nome, String email, Date dt_nasc, String cpf, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dt_nasc = dt_nasc;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Date getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	
	public String getCpf(String cpf) {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}