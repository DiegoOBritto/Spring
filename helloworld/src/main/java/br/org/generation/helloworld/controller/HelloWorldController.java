package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String helloShow() {
		return "Hoje utilizei a mentalidade de persistencia para dar inicio ao aprendizado de Spring e realizar essa atividade";
	}
}
