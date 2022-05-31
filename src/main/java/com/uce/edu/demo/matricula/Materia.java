package com.uce.edu.demo.matricula;

import org.springframework.stereotype.Component;

@Component
public class Materia {

	private String nombre;
	private int numHoras;
	
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	
	
	
}
