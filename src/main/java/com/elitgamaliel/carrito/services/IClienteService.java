package com.elitgamaliel.carrito.services;

import java.util.List;

import com.elitgamaliel.carrito.entitys.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente save(Cliente actividades);

	public Cliente findById(Integer id);
	
	public void delete(Integer id);
}
