package com.clases;

public class Documento {
	private String 	docuTipo;
	private Long	docuNro;
	
	public Documento() {}
	
	public void setDocuNro(Long data) {
		this.docuNro = data;
	}
	
	public Long getDocuNro() {
		return this.docuNro;
	}
	
	public void setDocuTipo (String data) {
		this.docuTipo = data;
	}
	
	public String getDocuTipo() {
		return this.docuTipo;
	}
	
}
