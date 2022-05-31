package com.uce.edu.demo.matricula;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {
	
	private String nombre;
	private String apellido;
	private int creditos;
	
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	

	
}
