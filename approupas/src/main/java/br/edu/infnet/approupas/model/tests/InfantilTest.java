package br.edu.infnet.approupas.model.tests;

import br.edu.infnet.approupas.model.domain.Infantil;

public class InfantilTest {
	
	public static void main(String[] args) {
		
		Infantil i1 = new Infantil(123456, "Camisa", 35, 1);
		i1.setConjunto(true);
		i1.setCor("branco");
		i1.setNumeracao(4);
		System.out.println(i1);
		
		Infantil i2 = new Infantil(123456, "Moletom", 55, 1);
		i2.setConjunto(true);
		i2.setCor("azul");
		i2.setNumeracao(2);
		System.out.println(i2);
		
		Infantil i3 = new Infantil(123456, "Calça", 75, 1);
		i3.setConjunto(false);
		i3.setCor("preta");
		i3.setNumeracao(6);
		System.out.println(i3);
		
		
		
		
		
	}

}
