package com.bahamut.models;

public enum Cargo {

	DELEGADO("Delegado de Polícia"),
	JUIZ("Juiz de Direito"),
	DESEMBARGADOR("Desembargador"),
	PROMOTOR("Promotor"),
	PROCURADOR("Procurador"),
	ADVOGADO("Advogado"),
	PERITO("Perito"),
	CONSELHEIRO("Conselheiro"),
	OFICIAL_MILITAR("Oficial da Policial Militar"),
	OFICIAL_FA("Oficial das Forças Armadas"),
	CIOPS("Ciops"),
	OUTROS("outros");
	
	private String descricao;

	Cargo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
		
	}
	
}
