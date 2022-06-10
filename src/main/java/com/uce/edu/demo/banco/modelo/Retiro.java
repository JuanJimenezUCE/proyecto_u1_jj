package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	private LocalDateTime fecha;
	private String numero;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Retiro [fecha=" + fecha + ", numero=" + numero + ", monto=" + monto + "]";
	}
	
	//SET Y GET
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
}
