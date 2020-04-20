package com.bahamut.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//abrir página login
	@GetMapping({ "/", "/login"} )
	public String login() {
		return "login";
	}
	
	
	//abrir págima home
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("mensagem", "Bem vindo  " );
		return "home";
	}
	
	
	//login inválido
	@GetMapping({"/login-error"})
	public String loginError(ModelMap model) {
		model.addAttribute("alerta", "erro");
		model.addAttribute("titulo", "Credenciais inválidas!");
		model.addAttribute("texto", "Login ou senha não conferem!");
		model.addAttribute("subtexto", "Cadastro não ativado");
		return "login";
	}
	
	
}
