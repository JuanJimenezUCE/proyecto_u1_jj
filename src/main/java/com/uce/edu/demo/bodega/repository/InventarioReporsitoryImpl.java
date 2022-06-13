package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
@Repository
public class InventarioReporsitoryImpl implements IInventarioRepostory{

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el inventario: "+i);
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario: "+i);
	}

	@Override
	public Inventario buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el inventario : "+codigo);
		
		Inventario i=new Inventario();
		i.getCodigo();
		
		return i;
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario: "+codigo);
	}

}
