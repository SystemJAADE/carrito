package com.elitgamaliel.carrito.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitgamaliel.carrito.dao.IProductoDao;
import com.elitgamaliel.carrito.entitys.Producto;
import com.elitgamaliel.carrito.services.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDao productoDao;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public Producto findById(Integer id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		productoDao.deleteById(id);
	}

}
