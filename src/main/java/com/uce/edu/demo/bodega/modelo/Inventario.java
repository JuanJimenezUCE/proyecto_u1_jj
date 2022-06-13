package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {

	private Integer codigo;
	private List<Producto> listaProducto;
	


	@Override
	public String toString() {
		return "Inventario [codigo= " + codigo + ", listaProducto=\n" + listaProducto + "]";
	}


	//GET Y SET
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public List<Producto> getListaProducto() {
		return listaProducto;
	}


	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}


}
	



	

