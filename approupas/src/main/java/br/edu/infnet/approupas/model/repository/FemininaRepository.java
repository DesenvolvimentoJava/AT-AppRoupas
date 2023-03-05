package br.edu.infnet.approupas.model.repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.approupas.model.domain.Feminina;

public class FemininaRepository {
		
	private static Integer id = 1;
	
	private static Map<Integer, Feminina> mapaFeminina = new HashMap<>();
	
	
	
	public static boolean incluir(Feminina feminina) {
		
		feminina.setId(id++);
		
		try {
			mapaFeminina.put(feminina.getId(), feminina);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public static Feminina excluir(Integer key) {
		return mapaFeminina.remove(key);
	}
	
	
	public static Collection<Feminina> obterLista(){
		
		return mapaFeminina.values();
	}
}
