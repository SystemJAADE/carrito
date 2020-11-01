package com.elitgamaliel.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elitgamaliel.carrito.entitys.Producto;

@Repository
public interface IProductoDao extends JpaRepository<Producto, Integer> {

}
