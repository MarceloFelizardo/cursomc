package com.backend.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.cursomc.domain.Categoria;
import com.backend.cursomc.repositories.CategoriaRepository;


// anotação JPA para serviços
@Service
public class CategoriaService {
	
	// anotação "spring" para instanciar o repositoria automaticamente
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
