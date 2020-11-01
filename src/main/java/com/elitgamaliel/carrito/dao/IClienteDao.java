package com.elitgamaliel.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elitgamaliel.carrito.entitys.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Integer> {

}
