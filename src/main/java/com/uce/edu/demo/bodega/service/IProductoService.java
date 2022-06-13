package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {

	public void ingresarProducto(Producto p);
	
	public Producto buscarProducto(String nombre);
	
	public void actualizarProducto(Producto p);
	
	public void eliminarProducto(Producto p);
	
}
