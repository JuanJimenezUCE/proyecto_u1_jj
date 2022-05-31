package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula3 {
    //3)DI por metodo SET
	
	private Estudiante estudiante;//a su metodo SET le pongo @Autowired
	private Materia materia;//a su metodo SET le pongo @Autowired
	private LocalDateTime fechaMatricula;
	
	
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
		return "Matricula por metodo SET generada";
		
	}
	//GET Y SET
	public Estudiante getEstudiante() {
		return estudiante;
	}
	@Autowired
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	@Autowired
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
