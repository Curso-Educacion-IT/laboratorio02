package com.clases;

public class Persona {
	
	private String 		nombre;
	private String 		apellido;
	private int			edad;
	public 	Documento 	documento;
	
	public Persona(){
		instanciarDocumento();
	}
	
	public Persona(int edad){
		instanciarDocumento();
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, String docuTipo, long docuNro, int edad){
		instanciarDocumento();
		this.nombre 	= nombre;
		this.apellido 	= apellido;
		documento.setDocuTipo(docuTipo);
		documento.setDocuNro(docuNro);
		this.edad 		= edad;
	}
	
	private void instanciarDocumento() {
		documento = new Documento();
	}
	
	public void setNombre (String data) {
		this.nombre = data;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido (String data) {
		this.apellido = data;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setEdad (int data) {
		this.edad = data;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getAdulto() {
		String leyenda = "";
		if (this.edad <= 18) {
			leyenda = "Menor de edad";
		}else {
			leyenda = "Mayor de edad";
		}
		return leyenda;
	}
	
}
