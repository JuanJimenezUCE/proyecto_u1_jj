package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el retiro: "+r);
	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base de datos el retiro: "+numero);
		Retiro r=new Retiro();
		r.setNumero(numero);
		return r;
	}

	@Override
	public void actualizar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: "+numeroCuentaDestino);
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el  retiro de fecha : "+fecha);
	}
	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1= new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumero("1239");
		
		listaRetiros.add(reti1);
		
		return listaRetiros;
		
	}



}
