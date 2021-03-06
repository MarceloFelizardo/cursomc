package com.backend.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.cursomc.domain.Categoria;

/* Operações de acesso a dados referentes aos objetos "Categoria"
 * 
 * */


// anotação JPA para tipos repositórios
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
