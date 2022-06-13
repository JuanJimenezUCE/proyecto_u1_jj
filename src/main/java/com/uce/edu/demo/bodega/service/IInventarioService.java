package com.uce.edu.demo.bodega.service;

import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {


	public void insertarInventario(List<Producto> listaProductos);
	
	public Inventario buscarInventario(String codigo);
	
	public void actualizarInventario(Inventario i);
	
	public void eliminarInventario(String codigo);
}
