package com.elitgamaliel.carrito.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elitgamaliel.carrito.entitys.Usuario;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {

	Usuario findByUsername(String username);
}
