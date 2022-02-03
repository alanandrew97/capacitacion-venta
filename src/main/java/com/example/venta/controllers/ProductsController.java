package com.example.venta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.capacitacion.remote.dtos.Product;
import com.example.venta.services.ProductsService;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"}, maxAge = 3600)
@RestController
@RequestMapping("/api/venta/productos")
public class ProductsController {
	@Autowired
	private ProductsService productsService;
	
	@GetMapping
	private ResponseEntity<List<Product>> getProducts() {
		try {
			return ResponseEntity.ok(productsService.getAll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
