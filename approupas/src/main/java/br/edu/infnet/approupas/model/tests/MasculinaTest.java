package br.edu.infnet.approupas.model.tests;

import br.edu.infnet.approupas.model.domain.Masculina;

public class MasculinaTest {
	
	public static void main(String[] args) {
		
		Masculina m1 = new Masculina(1,"Calça", 12, 5);
		m1.setBordado(true);
		m1.setComposicao("100% Algodão");
		m1.setTamanho("P");
		System.out.println(m1);
		System.out.println(m1.calcularValorRoupa());
		
		Masculina m2 = new Masculina(12,"Camisa", 52, 3);
		m2.setBordado(true);
		m2.setComposicao("67% Seda");
		m2.setTamanho("G");
		System.out.println(m2);
		System.out.println(m2.calcularValorRoupa());
		
		Masculina m3 = new Masculina(123,"Calça", 24, 5);
		m3.setBordado(false);
		m3.setComposicao("33% Viscose");
		m3.setTamanho("M");
		System.out.println(m3);
		System.out.println(m3.calcularValorRoupa());
		
	}

}
