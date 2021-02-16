package com.backend.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cursomc.domain.Categoria;

@RestController								// diretiva SpringBoot - controlador REST
@RequestMapping(value = "/categorias")		// diretiva SpringBoot - Endpoint
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)	// diretiva SpringBoot
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		// Como o List é uma interface ele não pode ser instanciado, então usa-se a classe "ArrayList".
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista; 
	}
}
