package com.uce.edu.demo.concesionario.modelo;

import java.time.LocalDateTime;

public class Auto {

	private String modelo;
	private String marca;
	private String procedencia;
	private LocalDateTime fechaFabricacion;
	
	
	
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + ", procedencia=" + procedencia + ", fechaFabricacion="
				+ fechaFabricacion + "]";
	}
	
	//SET Y GET
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public LocalDateTime getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(LocalDateTime fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	
}
