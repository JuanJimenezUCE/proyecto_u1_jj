package com.uce.edu.demo.concesionario.modelo;

import java.time.LocalDateTime;

public class VentaAuto {

	private String numero;
	private LocalDateTime fecha;
	private Auto auto;
	
	@Override
	public String toString() {
		return "VentaAuto [numero=" + numero + ", fecha=" + fecha + ", auto=" + auto + "]";
	}
	
	//SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	
	
	
}
