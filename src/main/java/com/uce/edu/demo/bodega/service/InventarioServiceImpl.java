package com.uce.edu.demo.bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepostory;
@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepostory inventarioRepostory;
	@Override
	public void insertarInventario(List<Producto> listaProductos) {
		// TODO Auto-generated method stub
		Inventario inventario=new Inventario();
		inventario.setListaProducto(listaProductos);
		inventario.setCodigo(123);
		this.inventarioRepostory.insertar(inventario);
	}
	@Override
	public Inventario buscarInventario(String codigo) {
		// TODO Auto-generated method stub
		return this.inventarioRepostory.buscar(codigo);
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.inventarioRepostory.actualizar(i);
	}

	@Override
	public void eliminarInventario(String codigo) {
		// TODO Auto-generated method stub
		this.inventarioRepostory.eliminar(codigo);
	}





}
