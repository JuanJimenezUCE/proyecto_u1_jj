package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	public void ingresarMatricula(Matricula m );
	
	
	public Matricula buscarPorEstudiante(String Estudiante);
	
	
	public void actualizarMatricula(Matricula m);
	
	
	public void borrarMatricula(String numero);
}
