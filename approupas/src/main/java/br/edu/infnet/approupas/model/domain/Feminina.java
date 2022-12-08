package br.edu.infnet.approupas.model.domain;

public class Feminina extends Roupa {
	
	private boolean estampa;
	private String tamanho;
	private String colecao;
	
	public Feminina(int cod_prod, String descricao, float valor, int quantidade) {
		super(cod_prod, descricao, valor, quantidade);
	}
	
	@Override
	public float calcularValorRoupa() {
		return 0;
	}
	
	
	public boolean isEstampa() {
		return estampa;
	}
	public void setEstampa(boolean estampa) {
		this.estampa = estampa;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getColecao() {
		return colecao;
	}
	public void setColecao(String colecao) {
		this.colecao = colecao;
	}
	
	
	

}
