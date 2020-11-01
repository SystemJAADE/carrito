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

import com.elitgamaliel.carrito.entitys.DetalleVenta;
import com.elitgamaliel.carrito.services.IDetalleVentaService;

@RestController
@RequestMapping("/detalle-venta")
public class DetalleVentaController {

	@Autowired
	private IDetalleVentaService detalleVentaService;

	@GetMapping
	public ResponseEntity<List<DetalleVenta>> Venta() {
		return ResponseEntity.ok(detalleVentaService.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<DetalleVenta> VentaById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(detalleVentaService.findById(id));
	}

	@PostMapping
	public ResponseEntity<DetalleVenta> crear(@RequestBody DetalleVenta detalleventa) {
		return ResponseEntity.ok(detalleVentaService.save(detalleventa));
	}

	@PutMapping
	public ResponseEntity<DetalleVenta> update(@RequestBody DetalleVenta detalleventa) {
		return ResponseEntity.ok(detalleVentaService.save(detalleventa));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<DetalleVenta> delete(@PathVariable("id") Integer id) {
		detalleVentaService.delete(id);
		return ResponseEntity.ok(null);
	}

}