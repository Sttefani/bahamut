package com.bahamut.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "unidade")
public class Unidade extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 8, max = 50)
	private String nome;
	
	@NotNull
	@Column(unique = true, nullable = false)
	@Size(min = 8, max = 50)
	private String email;

	@Column(nullable = true)
	@Size(max= 12)
	private String celularInstitucional;
	

	public Unidade(Long id, @NotNull @Size(min = 8, max = 50) String nome,
			@NotNull @Size(min = 8, max = 50) String email, @Size(max = 12) String celularInstitucional) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celularInstitucional = celularInstitucional;
	}


	public Unidade() {
		
	}


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
		Unidade other = (Unidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
