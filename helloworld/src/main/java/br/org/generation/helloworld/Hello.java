package br.org.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class Hello {

	@GetMapping
	public String helloShow() {
		return "Hello Família 36!";
	}
}
