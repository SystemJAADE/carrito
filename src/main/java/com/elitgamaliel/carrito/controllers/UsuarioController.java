package com.elitgamaliel.carrito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elitgamaliel.carrito.entitys.Usuario;
import com.elitgamaliel.carrito.services.IUsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

//	public UsuarioController(BCryptPasswordEncoder bCryptPasswordEncoder) {
//		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//	}

	@PostMapping()
	public void saveUsuario(@RequestBody Usuario user) {
//		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		usuarioService.save(user);
	}

	@GetMapping()
	public List<Usuario> getAllUsuarios() {
		return usuarioService.findAll();
	}

	@GetMapping("/{username}")
	public Usuario getUsuario(@PathVariable String username) {
		return usuarioService.findByUsername(username);
	}
}