package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado un producto: "+c);
	}

	@Override
	public void actualizar(Producto c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado un producto: "+c);
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el producto : "+nombre);
	
		Producto p=new Producto();
		p.setNombre(nombre);
		
		return p;
	}

	@Override
	public void eliminar(Producto c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado un producto: "+c);
	}

}
