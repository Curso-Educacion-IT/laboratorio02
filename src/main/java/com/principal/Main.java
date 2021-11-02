package com.principal;

import java.util.Scanner;
import com.clases.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i_cantidad, i;
		Scanner sc = new Scanner(System.in);
		Persona p[] = null;
		
		System.out.println("************PRACTICA DE LABORATORIO************");
		System.out.print("Por favor ingrese la cantidad de personas: ");
		i_cantidad = sc.nextInt();
		p = new Persona[i_cantidad];
		
		i = 0;
		while (i<i_cantidad) {
			p[i] = new Persona();
			System.out.println("*******************************************");
			System.out.print("Ingrese el nombre: ");
			p[i].setNombre (sc.next());
			System.out.print("Ingrese el apellido: ");
			p[i].setApellido (sc.next());
			System.out.print("Ingrese el tipo de documento: ");
			p[i].documento.setDocuTipo (sc.next());
			System.out.print("Ingrese el numero de documento: ");
			p[i].documento.setDocuNro (sc.nextLong());
			System.out.print("Ingrese la edad: ");
			p[i].setEdad (sc.nextInt());
			i++;
		}
		sc.close();
		
		i = 0;
		while (i<i_cantidad) {
			System.out.println("*******************************************");
			System.out.println("Nombre: "+p[i].getNombre());
			System.out.println("Apellido: "+p[i].getApellido());
			System.out.println("Tipo de documento: "+p[i].documento.getDocuTipo());
			System.out.println("Documento: "+p[i].documento.getDocuNro().toString());
			System.out.println("Edad: "+p[i].getEdad());
			System.out.println(p[i].getAdulto());
			i++;
		}
		
	}

}
