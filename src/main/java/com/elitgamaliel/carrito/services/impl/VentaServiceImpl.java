package com.elitgamaliel.carrito.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitgamaliel.carrito.dao.IVentaDao;
import com.elitgamaliel.carrito.entitys.Venta;
import com.elitgamaliel.carrito.services.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaDao ventaDao;

	@Override
	public List<Venta> findAll() {
		return (List<Venta>) ventaDao.findAll();
	}

	@Override
	public Venta save(Venta venta) {
		return ventaDao.save(venta);
	}

	@Override
	public Venta findById(Integer id) {
		return ventaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		ventaDao.deleteById(id);
	}

}
