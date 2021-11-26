package com.kleytonleite.cursospring.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public String lista() {
		return "REST Está Funcionando!!";
	}
}
