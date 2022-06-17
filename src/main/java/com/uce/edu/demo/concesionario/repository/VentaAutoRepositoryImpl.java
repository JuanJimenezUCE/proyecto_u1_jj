package com.uce.edu.demo.concesionario.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.concesionario.modelo.VentaAuto;
@Repository
public class VentaAutoRepositoryImpl implements IVentaAutoRepository{

	@Override
	public void insertar(VentaAuto v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos : " +v);
	}

}
