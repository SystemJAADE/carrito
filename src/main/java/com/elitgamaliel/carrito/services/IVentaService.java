package com.elitgamaliel.carrito.services;

import java.util.List;

import com.elitgamaliel.carrito.entitys.Venta;

public interface IVentaService {

	public List<Venta> findAll();

	public Venta save(Venta venta);

	public Venta findById(Integer id);
	
	public void delete(Integer id);
}
