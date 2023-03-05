package br.edu.infnet.approupas.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.approupas.model.domain.Infantil;
import br.edu.infnet.approupas.model.repository.InfantilRepository;



@Controller
public class InfantilController {
	
	private String msg;
	
	public InfantilController() {
		
	}
	
	@GetMapping(value = "/infantil")
	public String telaCadastro() {
		return "infantil/cadastro";
	}

	@GetMapping(value = "/infantil/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("infantil", InfantilRepository.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "infantil/lista";
	}

	@PostMapping(value = "/infantil/incluir")
	public String incluir(Infantil infantil) {

		InfantilRepository.incluir(infantil);
		
		msg = "A inclusão da Infantil " + infantil.getDescricao() + " foi realizada com SUCESSO!!!";
		
		System.out.println(infantil.toString());
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/infantil/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Infantil infantil = InfantilRepository.excluir(id);
		
		msg = "A exclusão do Feminino " + infantil.getDescricao() + " foi realizada com SUCESSO!!!";
		
		
		return "redirect:/infantil/lista";
	}


}
