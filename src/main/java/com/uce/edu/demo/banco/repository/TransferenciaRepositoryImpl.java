package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la trasferencia en la base de datos: "+t);
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la tranferencia en la base de datos : " + t);
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se busco en  la transferencia: "+numeroCuentaOrigen);
		Transferencia trans=new Transferencia();
		trans.setNumeroCuentaOrigen(numeroCuentaOrigen);
		return trans;
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la transferencia en la base de datos: " + numeroCuentaDestino);
	}

}
