package br.edu.infnet.approupas.model.domain;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	
	public Cliente(String nome, String cpf, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(endereco);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getEmail() {
		return email;
	}
	
	
	
}
