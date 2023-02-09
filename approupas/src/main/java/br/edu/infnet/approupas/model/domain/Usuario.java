package br.edu.infnet.approupas.model.domain;

public class Usuario {
	
	private String nome;
	private String sobrenome;
	private String email;
	private String tel;
	private String tipo;
	
	public Usuario(String nome, String sobrenome, String email) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEmail(email);
	}
	
	
	@Override
	public String toString() {
		return String.format("O usuário %s - %s tem o email %s -  telefone: %s e tipo %s. ",
				nome,
				sobrenome,
				email,
				tel,
				tipo
				);
	}
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
