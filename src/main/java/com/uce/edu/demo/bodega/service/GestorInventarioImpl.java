package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
@Service
public class GestorInventarioImpl implements IGestorInventario{


	@Override
	public BigDecimal calculoPrecio(Producto p) {
		// TODO Auto-generated method stub
		BigDecimal g=p.getPrecioCompra().multiply(new BigDecimal(10)).divide(new BigDecimal(100));
		BigDecimal iva=p.getPrecioCompra().multiply(new BigDecimal(12)).divide(new BigDecimal(100));
		BigDecimal precioVenta=p.getPrecioCompra().add(g).add(iva);
		return precioVenta;
	}

	@Override
	public List<Producto> consultarInventario(List<Producto> reporte, LocalDateTime fechaBusqueda) {
		// TODO Auto-generated method stub
		List<Producto> inventario=new ArrayList<>();
		for(Producto p: reporte) {
			if(p.getFechaIngreso().compareTo(fechaBusqueda)>0 ) {
				inventario.add(p);
			}
		}
		return inventario;
	}

}
