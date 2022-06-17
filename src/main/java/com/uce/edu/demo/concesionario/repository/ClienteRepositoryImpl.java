package com.uce.edu.demo.concesionario.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.concesionario.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository{

	@Override
	public void insertar(Cliente e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos : " +e);
	}


}
