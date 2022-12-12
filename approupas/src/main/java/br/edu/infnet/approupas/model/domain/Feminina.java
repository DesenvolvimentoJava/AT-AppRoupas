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
		return (float) ((getValor() * getQuantidade()) + 
				(estampa ? 5.0 * getQuantidade() : 1.0 * getQuantidade()));
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(estampa);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(colecao);
		
		return sb.toString();
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
