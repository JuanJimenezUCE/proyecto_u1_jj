package com.uce.edu.demo.concesionario.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Vendedor {

	private String nombre;
	private String apellido;
	private String nVentas;
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", apellido=" + apellido + ", nVentas=" + nVentas + "]";
	}
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String noombre) {
		this.nombre = noombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getnVentas() {
		return nVentas;
	}
	public void setnVentas(String nVentas) {
		this.nVentas = nVentas;
	}
	
	
}
