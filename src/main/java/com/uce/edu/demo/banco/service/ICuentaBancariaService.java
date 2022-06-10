package com.uce.edu.demo.banco.service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	
	public void ingresar(CuentaBancaria e );
	public void actualizar(CuentaBancaria c);
	public CuentaBancaria buscar(String numero);
	public void borrar(String numero);
}
