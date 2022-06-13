package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepostory {
	
	public void insertar(Inventario i );
	
	public void actualizar(Inventario i);
	
	public Inventario buscar(String codigo);
		
	public void eliminar(String codigo);

}
