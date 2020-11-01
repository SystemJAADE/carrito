package com.elitgamaliel.carrito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elitgamaliel.carrito.entitys.Cliente;
import com.elitgamaliel.carrito.services.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<Cliente>> actividades() {
		return ResponseEntity.ok(clienteService.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<Cliente> actividadesById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(clienteService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente) {
		return ResponseEntity.ok(clienteService.save(cliente));
	}

	@PutMapping
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
		return ResponseEntity.ok(clienteService.save(cliente));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Cliente> delete(@PathVariable("id") Integer id) {
		clienteService.delete(id);
		return ResponseEntity.ok(null);
	}

}