package com.uce.edu.demo.concesionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.concesionario.modelo.Cliente;
import com.uce.edu.demo.concesionario.repository.IClienteRepository;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteRepository iClienteRepository;
	@Override
	public void ingresarCliente(Cliente c) {
		// TODO Auto-generated method stub
		this.iClienteRepository.insertar(c);
	}

}
