package com.elitgamaliel.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elitgamaliel.carrito.entitys.DetalleVenta;

@Repository
public interface IDetalleVentaDao extends JpaRepository<DetalleVenta, Integer> {

}
