package com.kleytonleite.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleytonleite.cursospring.domain.Categoria;
import com.kleytonleite.cursospring.repositories.CategoriaRepository;
import com.kleytonleite.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	protected static final String EXCEPTION_SERVICE = "Object Not Found! Id: ";
	protected static final String CLASS_TIPO_EXCEPTION = "Tipo: " + Categoria.class.getName();
	
	@Autowired
	private CategoriaRepository rep;
	
	public Categoria buscar(Integer id) {	
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(EXCEPTION_SERVICE + id + " - " + CLASS_TIPO_EXCEPTION));
	}

}
