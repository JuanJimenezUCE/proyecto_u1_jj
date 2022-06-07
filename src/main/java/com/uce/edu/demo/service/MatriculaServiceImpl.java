package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService{

	

	@Autowired
	private IMatriculaRepository matriRepository;
	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriRepository.insertar(m);
	}

	@Override
	public Matricula buscarPorEstudiante(String Estudiante) {
		// TODO Auto-generated method stub
		return this.matriRepository.buscar(Estudiante);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriRepository.actualizar(m);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriRepository.eliminar(numero);
	}

}
