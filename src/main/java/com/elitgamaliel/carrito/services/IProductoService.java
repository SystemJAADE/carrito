package com.elitgamaliel.carrito.services;

import java.util.List;

import com.elitgamaliel.carrito.entitys.Producto;

public interface IProductoService {

	public List<Producto> findAll();

	public Producto save(Producto producto);

	public Producto findById(Integer id);
	
	public void delete(Integer id);
}
