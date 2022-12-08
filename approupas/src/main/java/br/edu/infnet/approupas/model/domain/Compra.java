package br.edu.infnet.approupas.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Compra {
	
	private String descricao;
	private boolean loja;
	private LocalDateTime data;
	private Cliente cliente;
	private List<Roupa> roupas;
	
	
	public Compra() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		return String.format("%s;%s;%s",
				descricao,
				loja ? "Sim" : "Não",
				data.format(formato)
				);

	}
		

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isLoja() {
		return loja;
	}
	public void setLoja(boolean loja) {
		this.loja = loja;
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
	public LocalDateTime getData() {
		return data;
	}
	
	
	
	
	
	
	

}
