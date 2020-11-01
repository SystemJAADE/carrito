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

import com.elitgamaliel.carrito.entitys.Producto;
import com.elitgamaliel.carrito.services.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@GetMapping
	public ResponseEntity<List<Producto>> producto() {
		return ResponseEntity.ok(productoService.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<Producto> productoById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(productoService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Producto> crear(@RequestBody Producto producto) {
		return ResponseEntity.ok(productoService.save(producto));
	}

	@PutMapping
	public ResponseEntity<Producto> update(@RequestBody Producto producto) {
		return ResponseEntity.ok(productoService.save(producto));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Producto> delete(@PathVariable("id") Integer id) {
		productoService.delete(id);
		return ResponseEntity.ok(null);
	}

}