package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
@Qualifier("ahorros")
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService{
	
	@Override
	public void ingresar(CuentaBancaria e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta,BigDecimal saldo) {
		// TODO Auto-generated method stub
		//Codigo duplicado lo solucionamos con una fachada
		//CuentaBancaria cta=this.bancariaRepository.buscar(numeroCta);
		//BigDecimal saldo = cta.getSaldo();
		
		BigDecimal interes = new BigDecimal(560).multiply(new BigDecimal(15).divide(new BigDecimal(100)));
		interes= interes.add(saldo.divide(new BigDecimal(100)));
		
		return interes;
	}

}