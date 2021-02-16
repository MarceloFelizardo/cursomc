package com.backend.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cursomc.domain.Categoria;
import com.backend.cursomc.services.CategoriaService;

@RestController								// diretiva SpringBoot - controlador REST
@RequestMapping(value = "/categorias")		// diretiva SpringBoot - Endpoint
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service; 
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)	// diretiva SpringBoot
	public ResponseEntity<?> find(@PathVariable Integer id) {		// anotação spring "PathVariable" associa "id da url" com "id da variavel"
																	// 	anotação spring "ResponseEntity" oferece resposta HTTP para service REST					
		/*
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		// Como o List é uma interface ele não pode ser instanciado, então usa-se a classe "ArrayList".
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		*/
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj); 
	}
}
