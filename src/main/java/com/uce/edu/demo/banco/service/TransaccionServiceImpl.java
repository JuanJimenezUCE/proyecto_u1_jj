package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.modelo.to.TransaccionTo;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
@Service
public class TransaccionServiceImpl implements ITransaccionService{
	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private IDepositoService iDepositoService;
	@Autowired
	private IRetiroService iRetiroService;
	@Autowired
	private ITransferenciaRepository iTransdeITransferenciaRepository;
	@Autowired
	private IDepositoRepository iDepositoRepository;
	@Autowired
	private IRetiroRepository iRetiroRepository;
	
	
	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.realizarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta , LocalDateTime fechaInicio,LocalDateTime fechaFin){
		
		
		List<Transferencia> listaTrans = this.iTransdeITransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		
		//Vamos a unir las listas
		List <TransaccionTo> listaFinal=new ArrayList<>();
		for(Transferencia t:listaTrans) {
			TransaccionTo transaccionTo =this.transformar(t);
			listaFinal.add(transaccionTo);
		}
		
		for(Deposito d:listaDepo) {
			TransaccionTo transaccionTo =this.transformar(d);
			listaFinal.add(transaccionTo);
		}
		
		for(Retiro r:listaReti) {
			TransaccionTo transaccionTo =this.transformar(r);
			listaFinal.add(transaccionTo);
		}
		
		return listaFinal;
    }
	
	private TransaccionTo transformar(Transferencia transferencia) {
		
		TransaccionTo tranTo= new TransaccionTo();
		tranTo.setFecha(transferencia.getFechaTransferencia());
		
		tranTo.setFecha(transferencia.getFechaTransferencia());
		tranTo.setMonto(transferencia.getMontoTranferir());
		tranTo.setTipo("T");
		
		return tranTo;
		
	}
	
	private TransaccionTo transformar(Deposito deposito) {
		
		TransaccionTo tranTo= new TransaccionTo();
		tranTo.setFecha(deposito.getFecha());
		tranTo.setMonto(deposito.getMonto());
		tranTo.setTipo("D");
		
		return tranTo;
		
	}
	private TransaccionTo transformar(Retiro retiro) {
		
		TransaccionTo tranTo= new TransaccionTo();
		tranTo.setFecha(retiro.getFecha());
		tranTo.setMonto(retiro.getMonto());
		tranTo.setTipo("R");
		
		return tranTo;
		
	}

}