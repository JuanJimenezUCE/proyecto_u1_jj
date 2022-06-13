package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {
	
	public void insertar(Producto p );
	
	public void actualizar(Producto p);
	
	public Producto buscar(String nombre);
	
	
	public void eliminar(Producto p);

}
