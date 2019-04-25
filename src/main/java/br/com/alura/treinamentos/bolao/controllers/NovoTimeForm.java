package br.com.alura.treinamentos.bolao.controllers;

import javax.validation.constraints.NotBlank;

public class NovoTimeForm {

	@NotBlank
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
