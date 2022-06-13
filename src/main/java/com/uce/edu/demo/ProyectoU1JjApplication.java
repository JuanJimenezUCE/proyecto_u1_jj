package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventario;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1JjApplication  implements CommandLineRunner{
	
	@Autowired
	private IGestorInventario gestorInventario;
	
	@Autowired
	private IInventarioService inventarioService;

	@Autowired
	private IProductoService iProductoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Producto p1=new Producto();
		p1.setNombre("Aceite");
		p1.setCantidad(100);
		p1.setPrecioCompra(new BigDecimal(3));
		p1.setPrecioVenta(this.gestorInventario.calculoPrecio(p1));
		p1.setFechaIngreso(LocalDateTime.of(2022, 3, 9, 12, 0));
		
		
		
		Producto p2=new Producto();
		p2.setNombre("Leche");
		p2.setCantidad(50);
		p2.setPrecioCompra(new BigDecimal(1.5));
		p2.setPrecioVenta(this.gestorInventario.calculoPrecio(p2));
		p2.setFechaIngreso(LocalDateTime.of(2022, 4, 10, 14, 30));
		
		Producto p3=new Producto();
		p3.setNombre("Carne");
		p3.setCantidad(10);
		p3.setPrecioCompra(new BigDecimal(10));
		p3.setPrecioVenta(this.gestorInventario.calculoPrecio(p3));
		p3.setFechaIngreso(LocalDateTime.of(2022, 6, 11, 14, 30));
		
		Producto p4=new Producto();
		p4.setNombre("Sardina");
		p4.setCantidad(10);
		p4.setPrecioCompra(new BigDecimal(5.50));
		p4.setPrecioVenta(this.gestorInventario.calculoPrecio(p4));
		p4.setFechaIngreso(LocalDateTime.of(2021, 12, 9, 12, 0));
		
		Producto p5=new Producto();
		p5.setNombre("Cloro");
		p5.setCantidad(25);
		p5.setPrecioCompra(new BigDecimal(15));
		p5.setPrecioVenta(this.gestorInventario.calculoPrecio(p5));
		p5.setFechaIngreso(LocalDateTime.of(2022, 1, 1, 13, 45));
		
		this.iProductoService.ingresarProducto(p1);
		this.iProductoService.ingresarProducto(p2);
		this.iProductoService.ingresarProducto(p3);
		this.iProductoService.ingresarProducto(p4);
		this.iProductoService.ingresarProducto(p5);
		
		List<Producto> reporte=new ArrayList<Producto>();
	
		reporte.add(p1);
		reporte.add(p2);
		reporte.add(p3);
		reporte.add(p4);
		reporte.add(p5);
		
		this.inventarioService.insertarInventario(reporte);
		System.out.println("[Consulta de productos ingresados por fecha]");
		List<Producto> consulta=this.gestorInventario.consultarInventario(reporte, LocalDateTime.of(2022, 1, 3, 12, 0));
		System.out.println(consulta);
	
	}

}
