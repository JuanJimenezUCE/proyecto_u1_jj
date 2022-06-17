package com.uce.edu.demo.concesionario.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.concesionario.modelo.Auto;
@Repository
public class AutoRepositoryImpl implements IAutoRepository{

	@Override
	public void insertar(Auto a) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos de Autos: " +a);
	}

}
