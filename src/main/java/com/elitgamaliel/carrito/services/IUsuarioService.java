package com.elitgamaliel.carrito.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elitgamaliel.carrito.entitys.Usuario;

@Service
public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario usuario);

	public Usuario findById(Integer id);
	
	public Usuario findByUsername(String username);
	
	public void delete(Integer id);
}
