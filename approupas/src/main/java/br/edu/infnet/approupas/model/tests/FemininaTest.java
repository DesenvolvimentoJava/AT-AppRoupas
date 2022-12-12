package br.edu.infnet.approupas.model.tests;

import br.edu.infnet.approupas.model.domain.Feminina;

public class FemininaTest {
	
	public static void main(String[] args) {
		
		Feminina f1 = new Feminina(122, "Saia", 73, 3);
		f1.setColecao("Verão");
		f1.setEstampa(false);
		f1.setTamanho("38");
		System.out.println(f1);
		
		Feminina f2 = new Feminina(122, "Calça", 130, 3);
		f2.setColecao("Inverno");
		f2.setEstampa(true);
		f2.setTamanho("38");
		System.out.println(f2);
		
		Feminina f3 = new Feminina(122, "Vestido", 130, 3);
		f3.setColecao("Outono");
		f3.setEstampa(true);
		f3.setTamanho("38");
		System.out.println(f3);
		
		
		
		
	}

}
