package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.matricula.Matricula;
import com.uce.edu.demo.matricula.Matricula2;
import com.uce.edu.demo.matricula.Matricula3;

@SpringBootApplication
public class ProyectoU1JjApplication  implements CommandLineRunner{
	
	//1) DI por atributo
//	@Autowired
//	private CitaMedica cita;
	
	
	//@Autowired
//	private CitaMedica2 cita;
	@Autowired
	private Matricula matricula;
	
	@Autowired
	private Matricula2 matricula2;
	
	@Autowired
	private Matricula3 matricula3;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	System.out.println("Mi primer proyecto con Spring Framework");
		
	
		String respuesta =this.cita.agendar(LocalDateTime.now(),"Javier","Teran",32,"Quito","Pepito",19);
		
		System.out.println(respuesta);*/
		System.out.println("Tarea 5 con Spring Framework");
		
		System.out.println("DI por atributos");
		String atributo =this.matricula.matricular(LocalDateTime.now(),"Juan","Jimenez",20,"Calculo Integral",6);	
		System.out.println(atributo);
		
		System.out.println("DI por constructor");
		String constructor =this.matricula2.matricular(LocalDateTime.now(),"Juan","Jimenez",20,"Programacion 1",8);	
		System.out.println(constructor);
		
		System.out.println("DI por metodo SET");
		String set =this.matricula3.matricular(LocalDateTime.now(),"Juan","Jimenez",20,"Algebra Lineal",4);	
		System.out.println(set);
	}

}
