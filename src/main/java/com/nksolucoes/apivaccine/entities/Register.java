package com.nksolucoes.apivaccine.entities;

import java.io.Serializable;
import java.time.Instant;

public class Register implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer cpf;
	private String nome;
	private String email;
	private Instant dtaNascimento;
	
	public Register() {
	}

	public Register(int id, Integer cpf, String nome, String email, Instant dtaNascimento) {
		super();
		this.id = (long) id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dtaNascimento = dtaNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
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

	public Instant getDtaNascimento() {
		return dtaNascimento;
	}

	public void setDtaNascimento(Instant dtaNascimento) {
		this.dtaNascimento = dtaNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
