package com.kleytonleite.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kleytonleite.cursospring.domain.Cliente;
import com.kleytonleite.cursospring.services.ClienteService;
    
@RestController
@RequestMapping(value= "/clientes")
public class ClienteResource {
	
	@Autowired
	ClienteService service;
		
	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> findAll(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
