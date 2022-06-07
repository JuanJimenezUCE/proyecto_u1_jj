package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos : " +m);
	}
	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base : " +nombre);
		return null;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base de datos : " +m);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha elimnado en la base de datos d: " +nombre);
	}

}