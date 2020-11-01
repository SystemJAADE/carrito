package com.elitgamaliel.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elitgamaliel.carrito.entitys.Venta;

@Repository
public interface IVentaDao extends JpaRepository<Venta, Integer> {

}
