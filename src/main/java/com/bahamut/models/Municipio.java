package com.bahamut.models;

public enum Municipio {

	
   AMAJARI("Amajari"),
   BOA_VISTA("Boa Vista"),
   BONFIM("Bonfim"),
   CANTA("Cantá"),
   CARACARAI("Cacaracaí"),
   CAROEBE("Caroebe"),
   IRACEMA("Iracema"),
   MUCAJAI("Mucajaí"),
   NORMANDIA("Normandia"),
   PACARAIMA("Pacaraima"),
   RORAINOPOLIS("Rorainópolis"),
   SAO_JOAO_DA_BALIZA("São João da Baliza"),
   SAO_LUIZ_DO_ANAUA("São Luis do Anauá"),
   UIRAMUTA("Uiramuta");
	
	
	private String descricao;

	Municipio(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
		
	}
}
