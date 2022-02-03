package com.example.venta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.capacitacion.remote.dtos.Product;
import com.example.venta.repositories.ProductsRepository;

@Service
public class ProductsService {
	@Autowired
	private ProductsRepository productsRepository;
	
	public List<Product> getAll() {
		return productsRepository.getProducts();
	}
}
