package com.backend.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;	// JPA - Faz o mapeamento "objeto - relacional". Converte objeto para tabela de banco de dados
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* Implemeta a interface "Serializable"
 * Que permite que os objetos desta classe podem ser convertidos
 * em uma sequencia de bytes. Para que eles possam ser gravados
 * em arquivos ou trafegar em redes etc
 * */


/* anotação para "jpa" para indicar que essa classe será uma "entidade jpa" */
@Entity		
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;	// versão padrão do serializable
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	// Defini geração automática dos IDs das categorias
	private Integer id;
	private String nome;
	
	public Categoria(){}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Para comparar os objetos por "Valor" (e NÃO pelo endereço).
	// Aqui usaremos o "id"
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
