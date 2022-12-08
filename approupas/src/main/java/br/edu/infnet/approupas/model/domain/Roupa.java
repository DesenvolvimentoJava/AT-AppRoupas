package br.edu.infnet.approupas.model.domain;

public abstract class Roupa {

	private int cod_prod;
	private String descricao;
	private float valor;
	private int quantidade;
	
	
	public Roupa(int cod_prod, String descricao, float valor, int quantidade) {
		this.cod_prod = cod_prod;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public abstract float calcularValorRoupa();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(cod_prod);
		sb.append(";");
		sb.append(descricao);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(quantidade);
	
		return sb.toString();
	}
	
	public int getCod_prord() {
		return cod_prod;
	}
	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
	
		
	
	
}
