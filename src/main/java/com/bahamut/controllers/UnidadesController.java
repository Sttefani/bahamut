package com.bahamut.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bahamut.models.Unidade;
import com.bahamut.security.repository.UnidadeRepository;

@Controller
public class UnidadesController {

	   @Autowired
	   private UnidadeRepository unidadeRepository;
	   
	   @GetMapping("/unidades")
		public ModelAndView Listar() {
			ModelAndView modelAndView = new ModelAndView("unidade/unidadeLista");
			List<Unidade> unidades = unidadeRepository.findAll();
			modelAndView.addObject("titulo", "Cadastro de Unidades");
			modelAndView.addObject("unidadesLista", unidades);
			return modelAndView;
		}
	   

	   
}

