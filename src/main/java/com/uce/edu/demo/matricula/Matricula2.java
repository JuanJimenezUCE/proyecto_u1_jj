package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Matricula2 {
  

	private Estudiante estudiante;
	private Materia materia;
	private LocalDateTime fechaMatricula;
	//2)DI por constructor
	public Matricula2(Estudiante estudiante,Materia materia) {
		
		this.estudiante=estudiante;
		this.materia=materia;
	}
	
	public String matricular(LocalDateTime fechaMatricula,String nombre,String apellido,
			int creditos,String nombreMateria,int numHoras) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setCreditos(creditos);
		
		this.materia.setNombre(nombreMateria);
		this.materia.setNumHoras(numHoras);
		
		//Seteamos atributos de la matricula
		this.fechaMatricula=fechaMatricula;
		
		//inserta la matricula en base de datos
		return "Matricula por constructor generada";
		
	}
	//GET Y SET
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
	
}
