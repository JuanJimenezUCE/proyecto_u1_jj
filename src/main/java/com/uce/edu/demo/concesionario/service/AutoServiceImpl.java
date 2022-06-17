package com.uce.edu.demo.concesionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.concesionario.modelo.Auto;
import com.uce.edu.demo.concesionario.repository.IAutoRepository;
@Service
public class AutoServiceImpl implements IAutoService{

	@Autowired
	IAutoRepository iAutoRepository;
	@Override
	public void ingresarAuto(Auto a) {
		// TODO Auto-generated method stub
		this.iAutoRepository.insertar(a);
	}

}
