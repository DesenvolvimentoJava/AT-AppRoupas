package br.edu.infnet.approupas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.approupas.model.domain.Usuario;
import br.edu.infnet.approupas.model.repository.AcessoRepository;

@Controller
@SessionAttributes("usuario")
public class AcessoControllerr {
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario user = new Usuario(email, senha);

		if(AcessoRepository.autenticar(user) != null) {
			model.addAttribute("usuario", user);
			return "redirect:/home";
		}
		
		model.addAttribute("mensagem", "As credenciais para o e-mail: "+ email + " estão incorretas!");
		
		return telaLogin();
	}
	
	
	@GetMapping(value= "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		//session.removeAtribute("usuario");
		
		return "redirect:/";
	}
	
}
