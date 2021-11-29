package com.kleytonleite.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleytonleite.cursospring.domain.Cliente;
import com.kleytonleite.cursospring.repositories.ClienteRepository;
import com.kleytonleite.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	protected static final String EXCEPTION_SERVICE = "Object Not Found! Id: ";
	protected static final String CLASS_TIPO_EXCEPTION = "Tipo: " + Cliente.class.getName();
	
	@Autowired
	private ClienteRepository rep;
	
	public Cliente buscar(Integer id) {	
		Optional<Cliente> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(EXCEPTION_SERVICE + id + " - " + CLASS_TIPO_EXCEPTION));
	}

}
