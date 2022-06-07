package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1JjApplication  implements CommandLineRunner{
	@Autowired
	private IEstudianteService estuService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante e= new Estudiante();
		e.setNombre("Juan");
		e.setApellido("Jimenez");
		e.setCedula("1723026900");
		
		this.estuService.ingresarEstudiante(e);
		
		Estudiante e1= new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("1723000900");
		
		this.estuService.ingresarEstudiante(e1);
		
		//Usar los  3 metodos restantes
		//actualizar , borrar, y buscar
		e.setCedula("1723026922");
		this.estuService.actualizarEstudiante(e);
		
		this.estuService.buscarPorApellido("Jimenez");
		
		this.estuService.borrarEstudiante("1723026922");
	}

}
