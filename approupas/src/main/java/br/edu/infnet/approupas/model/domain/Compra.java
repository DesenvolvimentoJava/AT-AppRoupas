package br.edu.infnet.approupas.model.domain;

import java.time.LocalDate;
import java.util.List;

public class Compra {
	
	private int cod_compra;
	private String descricao;
	private LocalDate data;
	private Cliente cliente;
	private List<Roupa> roupas;
	
	
	public LocalDate getData() {
		return data;
	}	
	
	public int getCod_compra() {
		return cod_compra;
	}
	public void setCod_compra(int cod_compra) {
		this.cod_compra = cod_compra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Roupa> getRoupas() {
		return roupas;
	}
	public void setRoupas(List<Roupa> roupas) {
		this.roupas = roupas;
	}
	
	
	

}
