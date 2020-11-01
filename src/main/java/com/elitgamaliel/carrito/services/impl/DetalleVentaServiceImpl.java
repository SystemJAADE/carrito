package com.elitgamaliel.carrito.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitgamaliel.carrito.dao.IDetalleVentaDao;
import com.elitgamaliel.carrito.entitys.DetalleVenta;
import com.elitgamaliel.carrito.services.IDetalleVentaService;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {

	@Autowired
	private IDetalleVentaDao detalleVentaDao;

	@Override
	public List<DetalleVenta> findAll() {
		return (List<DetalleVenta>) detalleVentaDao.findAll();
	}

	@Override
	public DetalleVenta save(DetalleVenta detalleVenta) {
		return detalleVentaDao.save(detalleVenta);
	}

	@Override
	public DetalleVenta findById(Integer id) {
		return detalleVentaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		detalleVentaDao.deleteById(id);
	}

}
