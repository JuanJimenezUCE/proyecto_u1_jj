package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1JjApplication  implements CommandLineRunner{
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IMatriculaService matriService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Materia m = new Materia();
		m.setNombre("Programacion Avanzada");
		m.setSemestre("6");
		
		Materia m2 = new Materia();
		m2.setNombre("Arquitectura y entornos");
		m2.setSemestre("5");
		
		this.materiaService.ingresarMateria(m);
		m.setSemestre("5");
		this.materiaService.actualizarMateria(m);
		this.materiaService.buscarPorMateria("Programacion Avanzada");
		this.materiaService.borrarMateria("Programacion Avanzada");
		
		Estudiante e= new Estudiante();
		e.setNombre("Juan");
		e.setApellido("Jimenez");
		e.setCedula("1723026900");
		
		List<Materia> quintoSemestre =  new ArrayList<>();
		quintoSemestre.add(m);
		quintoSemestre.add(m2);
		
		Matricula mat = new Matricula();
		mat.setNumero("123");
		mat.setEstudiante(e);
		mat.setMateria(quintoSemestre);
		
		this.matriService.ingresarMatricula(mat);
		mat.setNumero("124");
		this.matriService.actualizarMatricula(mat);
		this.matriService.buscarPorNumero("124");
		this.matriService.borrarMatricula("124");
	
	}

}
