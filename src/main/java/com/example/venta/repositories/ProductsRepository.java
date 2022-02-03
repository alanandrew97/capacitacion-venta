package com.example.venta.repositories;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.capacitacion.remote.dtos.Product;

@FeignClient(name = "productos-ms", url =  "${productos.uri}")
public interface ProductsRepository {

	@RequestMapping(value = "/api/products", method = RequestMethod.GET)
	List<Product> getProducts();
}
