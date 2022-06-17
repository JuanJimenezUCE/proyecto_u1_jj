package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.concesionario.modelo.Auto;
import com.uce.edu.demo.concesionario.modelo.GerenteVentas;
import com.uce.edu.demo.concesionario.modelo.Vendedor;
import com.uce.edu.demo.concesionario.modelo.VentaAuto;
import com.uce.edu.demo.concesionario.service.IAutoService;
import com.uce.edu.demo.concesionario.service.IVentaAutoService;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1JjApplication  implements CommandLineRunner{
	
	@Autowired
	private Vendedor vendedor1;
	
	@Autowired
	private Vendedor vendedor2;
	@Autowired
	private Vendedor vendedor3;
	@Autowired
	private GerenteVentas gerente;
	
	@Autowired
	private GerenteVentas gerente1;
	
	@Autowired
	private IVentaAutoService iVentaAutoService;
	
	@Autowired
	private IAutoService iAutoService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		System.out.println("EJEMPLO SINGLETON");
		
		this.gerente.setNombre("Juan ");
		this.gerente.setApellido("Jimenez");
		System.out.println(this.gerente);
		
		System.out.println("----");
		System.out.println(this.gerente1);
		
		this.gerente1.setNombre("Luis");
		System.out.println("----");
		System.out.println(this.gerente);
		
		
		System.out.println("----");
		System.out.println(this.gerente1);
		
		
		System.out.println("EJEMPLO PROTOTYPE");
		
		this.vendedor1.setNombre("James");
		this.vendedor1.setApellido("Hetfield");
		this.vendedor1.setnVentas("3");
		
		System.out.println(this.vendedor1);
		this.vendedor2.setNombre("Fernando");
		this.vendedor2.setApellido("Malla");
		this.vendedor2.setnVentas("5");
		
		System.out.println(this.vendedor2);
		System.out.println("-----");
		System.out.println(this.vendedor3);
		System.out.println("-----");
		Auto a = new Auto();
		a.setMarca("KIA");
		a.setModelo("Rio");
		a.setProcedencia("Mexico");
		a.setFechaFabricacion(LocalDateTime.of(2020, 10, 15, 16, 30));
		this.iAutoService.ingresarAuto(a);
		VentaAuto v= new VentaAuto();
		v.setNumero("1");
		v.setAuto(a);
		v.setFecha(LocalDateTime.now());
		this.iVentaAutoService.ingresarVenta(v);
		
		this.vendedor1.setnVentas("4");
		System.out.println(this.vendedor1);
	}

}
