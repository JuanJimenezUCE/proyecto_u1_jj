package com.uce.edu.demo.concesionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.concesionario.modelo.GerenteVentas;
import com.uce.edu.demo.concesionario.modelo.Vendedor;
import com.uce.edu.demo.concesionario.modelo.VentaAuto;
import com.uce.edu.demo.concesionario.repository.IVentaAutoRepository;
@Service
public class VentaAutoServiceImpl implements IVentaAutoService{

	@Autowired
	IVentaAutoRepository iVentaAutoRepository;
	
	@Autowired
	private Vendedor vendedor1;		
	@Autowired
	private GerenteVentas gerente;
	@Override
	public void ingresarVenta(VentaAuto v) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+this.gerente);
		System.out.println("DI desde Service PROTOTYPE "+this.vendedor1);
		this.iVentaAutoRepository.insertar(v);
	}

}
