package com.elitgamaliel.carrito.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitgamaliel.carrito.dao.IUsuarioDao;
import com.elitgamaliel.carrito.entitys.Usuario;
import com.elitgamaliel.carrito.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public Usuario findById(Integer id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

	@Override
	public void delete(Integer id) {
		usuarioDao.deleteById(id);
	}
}
