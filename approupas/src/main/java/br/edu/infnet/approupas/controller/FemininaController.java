package br.edu.infnet.approupas.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.approupas.model.domain.Feminina;
import br.edu.infnet.approupas.model.repository.FemininaRepository;



@Controller
public class FemininaController {
	
	private String msg;
	
	public FemininaController() {
		
	}
	
	@GetMapping(value = "/feminina")
	public String telaCadastro() {
		return "feminina/cadastro";
	}

	@GetMapping(value = "/feminina/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("feminina", FemininaRepository.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "feminina/lista";
	}

	@PostMapping(value = "/feminina/incluir")
	public String incluir(Feminina feminina) {

		FemininaRepository.incluir(feminina);
		
		msg = "A inclusão do Feminina " + feminina.getDescricao() + " foi realizada com SUCESSO!!!";
		
		System.out.println(feminina.toString());
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/feminina/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Feminina feminina = FemininaRepository.excluir(id);
		
		msg = "A exclusão do Feminino " + feminina.getDescricao() + " foi realizada com SUCESSO!!!";
		
		
		return "redirect:/feminina/lista";
	}


}
