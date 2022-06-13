package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombre;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private Integer cantidad;
	private LocalDateTime fechaIngreso;
	

	@Override
	public String toString() {
		return "Producto [ " + nombre + ", Cantidad=" + cantidad + ", Precio Venta=" + precioVenta
				+  ", Fecha de ingreso a bodega=" + fechaIngreso + "] \n";
	}
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
