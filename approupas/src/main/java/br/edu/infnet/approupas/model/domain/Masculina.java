package br.edu.infnet.approupas.model.domain;

public class Masculina extends Roupa {
	
	private boolean bordado;
	private String tamanho;
	private String composicao;
	
	
	public boolean isBordado() {
		return bordado;
	}
	public void setBordado(boolean bordado) {
		this.bordado = bordado;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	
	
	

}
