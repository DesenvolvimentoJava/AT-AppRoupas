package br.edu.infnet.approupas.model.tests;

import br.edu.infnet.approupas.model.domain.Cliente;

public class ClienteTest {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("huguinho","1234567891011", "Rua huguinho, 1", "eu@huguinho.com");
		System.out.println(c1);
		
		Cliente c2 = new Cliente("joaozinho","1234567891011", "Rua joaozinho, 2", "eu@joaozinho.com");
		System.out.println(c2);
		
		Cliente c3 = new Cliente("mariazinha","1234567891011", "Rua mariazinha, 3", "eu@mariazinha.com");
		System.out.println(c3);
		
	}

}
