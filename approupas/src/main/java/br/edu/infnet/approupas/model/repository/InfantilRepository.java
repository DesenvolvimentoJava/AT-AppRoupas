package br.edu.infnet.approupas.model.repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.approupas.model.domain.Infantil;

public class InfantilRepository {
		
	private static Integer id = 1;
	
	private static Map<Integer, Infantil> mapaInfantil = new HashMap<>();
	
	
	
	public static boolean incluir(Infantil infantil) {
		
		infantil.setId(id++);
		
		try {
			mapaInfantil.put(infantil.getId(), infantil);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public static Infantil excluir(Integer key) {
		return mapaInfantil.remove(key);
	}
	
	
	public static Collection<Infantil> obterLista(){
		
		return mapaInfantil.values();
	}
}
