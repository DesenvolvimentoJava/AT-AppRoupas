package br.edu.infnet.approupas.model.domain;

public class Infantil extends Roupa {
	
	private boolean conjunto;
	private int numeracao;
	private String cor;
	
	public Infantil(int cod_prod, String descricao, float valor, int quantidade) {
		super(cod_prod, descricao, valor, quantidade);
	}
	
	
	@Override
	public float calcularValorRoupa() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean isConjunto() {
		return conjunto;
	}
	public void setConjunto(boolean conjunto) {
		this.conjunto = conjunto;
	}
	public int getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
