package br.edu.infnet.approupas.model.tests;

import br.edu.infnet.approupas.model.domain.Cliente;
import br.edu.infnet.approupas.model.domain.Compra;

public class CompraTest {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("huguinho", "1234567891011", "Rua huguinho, 1", "eu@huguinho.com");
		Cliente c2 = new Cliente("joaozinho", "1234567891011", "Rua joaozinho, 2", "eu@joaozinho.com");
		Cliente c3 = new Cliente("mariazinha", "1234567891011", "Rua mariazinha, 3", "eu@mariazinha.com");

		Compra comp1 = new Compra();
		comp1.setDescricao("Primeira Compra");
		comp1.setLoja(false);
		comp1.setCliente(c1);
		System.out.println(comp1);

		Compra comp2 = new Compra();
		comp2.setDescricao("Segunda Compra");
		comp2.setLoja(true);
		comp1.setCliente(c1);
		System.out.println(comp2);

		Compra comp3 = new Compra();
		comp3.setDescricao("Terceira Compra");
		comp1.setCliente(c2);
		comp3.setLoja(true);
		System.out.println(comp3);

		Compra comp4 = new Compra();
		comp4.setDescricao("Quartar Compra");
		comp1.setCliente(c3);
		comp4.setLoja(false);
		System.out.println(comp4);
	}

}
