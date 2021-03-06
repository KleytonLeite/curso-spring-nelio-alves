package com.kleytonleite.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kleytonleite.cursospring.domain.Categoria;
import com.kleytonleite.cursospring.services.CategoriaService;
    
@RestController
@RequestMapping(value= "/categorias")
public class CategoriaResource {
	
	@Autowired
	CategoriaService service;
	
//	@PostMapping
//	public Categoria criar(@RequestBody Categoria categoria){
//		categoriaRepository.save(categoria);
//		return categoria;
//	}
	
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Categoria> findAll(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
