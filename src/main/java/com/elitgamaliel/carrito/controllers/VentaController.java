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

import com.elitgamaliel.carrito.services.IVentaService;
import com.elitgamaliel.carrito.entitys.Venta;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	private IVentaService ventaService;

	@GetMapping
	public ResponseEntity<List<Venta>> Venta() {
		return ResponseEntity.ok(ventaService.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<Venta> VentaById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(ventaService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Venta> crear(@RequestBody Venta venta) {
		return ResponseEntity.ok(ventaService.save(venta));
	}

	@PutMapping
	public ResponseEntity<Venta> update(@RequestBody Venta venta) {
		return ResponseEntity.ok(ventaService.save(venta));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Venta> delete(@PathVariable("id") Integer id) {
		ventaService.delete(id);
		return ResponseEntity.ok(null);
	}

}