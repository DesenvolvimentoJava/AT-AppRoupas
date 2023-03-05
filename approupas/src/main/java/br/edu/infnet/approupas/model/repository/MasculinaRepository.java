package br.edu.infnet.approupas.model.repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.approupas.model.domain.Masculina;

public class MasculinaRepository {
		
	private static Integer id = 1;
	
	private static Map<Integer, Masculina> mapaMasculina = new HashMap<>();
	
	
	
	public static boolean incluir(Masculina masculina) {
		
		masculina.setId(id++);
		
		try {
			mapaMasculina.put(masculina.getId(), masculina);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public static Masculina excluir(Integer key) {
		return mapaMasculina.remove(key);
	}
	
	
	public static Collection<Masculina> obterLista(){
		
		return mapaMasculina.values();
	}
}
