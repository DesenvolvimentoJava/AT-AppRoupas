package br.edu.infnet.approupas.model.domain;

public class Masculina extends Roupa {
	
	private boolean bordado;
	private String tamanho;
	private String composicao;
	
	
	public Masculina(int cod_prod, String descricao, float valor, int quantidade) {
		super(cod_prod, descricao, valor, quantidade);
	}
	
	
	@Override
	public float calcularValorRoupa() {
		
		return (float) ((getValor() * getQuantidade()) + (bordado ? 2.5 * getQuantidade() : 1.5 * getQuantidade()));
	}
	
	
	
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
