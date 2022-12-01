package br.edu.infnet.approupas.model.domain;

public abstract class Roupa {

	private int cod_prord;
	private String descricao;
	private float valor;
	private int quantidade;
	
	
	
	
	public int getCod_prord() {
		return cod_prord;
	}
	public void setCod_prord(int cod_prord) {
		this.cod_prord = cod_prord;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
