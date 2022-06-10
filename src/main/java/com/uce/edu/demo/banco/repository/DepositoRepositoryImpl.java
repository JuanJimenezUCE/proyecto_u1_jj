package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{


	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+d);
	}

	@Override
	public Deposito buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Se busco en  el deposito: "+numero);
		Deposito dep=new Deposito();
		dep.setNumero(numero);
		return dep;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el deposito: "+d);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el deposito: "+numero);
	}

}
