package com.bahamut.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "autoridade")
public class Autoridade extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 8, max = 50)
	@Column(unique = true, nullable = false)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Cargo cargo;
	
	@Enumerated(EnumType.STRING)
	private Origem origem;

	public Autoridade(Long id, @NotNull @Size(min = 8, max = 50) String nome, Cargo cargo, Origem origem) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.origem = origem;
	}
	public Autoridade() {
		
	}
}
