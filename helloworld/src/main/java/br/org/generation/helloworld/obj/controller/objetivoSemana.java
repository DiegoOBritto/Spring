package br.org.generation.helloworld.obj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class objetivoSemana {
	
	@GetMapping
	public String helloShow() {
		return "Vou manter o foco em atenção aos detalhes para aprender o máximo de conteúdo possível relacionado a SpringBoot";
	}
}
