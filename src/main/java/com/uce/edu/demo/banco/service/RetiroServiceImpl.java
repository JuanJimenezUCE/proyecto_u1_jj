package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			CuentaBancaria ctaOrigen = this.bancariaService.buscar(numeroCtaOrigen);
			BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();
			BigDecimal saldoFinal = saldoCtaOrigen.subtract(monto);
			
			ctaOrigen.setSaldo(saldoFinal);
			this.bancariaService.actualizar(ctaOrigen);
			
			Retiro retiro =new Retiro();
			retiro.setFecha(LocalDateTime.now());
			retiro.setNumero(numeroCtaOrigen);
			retiro.setMonto(monto);
			
			this.retiroRepository.insertarRetiro(retiro);
			
			
		}

	@Override
	public Retiro buscarPorId(String numero) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numero);
	}

	@Override
	public void actualizarCuentaRetiro(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(numeroCuentaDestino);
	}

	@Override
	public void eliminarRetiroDeFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(fecha);
	}
	}


