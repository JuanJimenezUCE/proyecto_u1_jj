package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TrasferenciaServiceImpl implements ITransferenciaService{
	
	//como la logica de CuentaBancariaService no hace nada
	//Si puedo Iyectar el CuentaBancariaRepository
    @Autowired
	private ICuentaBancariaService bancariaService;
    
    @Autowired
    private ITransferenciaRepository iTransferenciaRepository;
    
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen=this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal NuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(NuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t=new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTranferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.iTransferenciaRepository.insertar(t);
		
		
		
		
	}

}
