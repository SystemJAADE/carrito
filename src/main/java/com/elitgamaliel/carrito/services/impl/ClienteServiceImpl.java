package com.elitgamaliel.carrito.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.elitgamaliel.carrito.dao.IClienteDao;
import com.elitgamaliel.carrito.entitys.Cliente;
import com.elitgamaliel.carrito.services.IClienteService;

public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public Cliente findById(Integer id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		clienteDao.deleteById(id);
	}

}
