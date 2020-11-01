package com.elitgamaliel.carrito.services;

import java.util.List;

import com.elitgamaliel.carrito.entitys.DetalleVenta;

public interface IDetalleVentaService {

	public List<DetalleVenta> findAll();

	public DetalleVenta save(DetalleVenta detalleVenta);

	public DetalleVenta findById(Integer id);
	
	public void delete(Integer id);
}
