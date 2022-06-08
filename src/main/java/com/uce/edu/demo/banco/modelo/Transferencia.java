package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {

	private String numeroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal montoTranferir;
	private LocalDateTime fechaTransferencia;
	
	
	
	@Override
	public String toString() {
		return "Transferencia [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", montoTranferir=" + montoTranferir + ", fechaTransferencia="
				+ fechaTransferencia + "]";
	}
	//SET Y GET
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMontoTranferir() {
		return montoTranferir;
	}
	public void setMontoTranferir(BigDecimal montoTranferir) {
		this.montoTranferir = montoTranferir;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	
	
	
}
