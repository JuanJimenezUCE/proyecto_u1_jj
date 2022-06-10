package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia(String ctaOrigen,String ctaDestino, BigDecimal monto);
	
	public void actualizar(Transferencia c);
	public Transferencia buscar(String ctaOrigen);
	public void borrar(String ctaDestino);
}
