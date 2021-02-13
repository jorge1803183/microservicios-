package com.productos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.entities.Producto;
import com.productos.services.IProductoServices;

@RestController
@RequestMapping("/api/productos")
public class ProductoRestController {

	@Autowired
	private IProductoServices productoServices;
	
	@GetMapping("")
	public List<Producto> listar(){
		return productoServices.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Producto> ver(@PathVariable Long id){
		return productoServices.findById(id);
	}
	
	@PostMapping("") /*POST - create */
	public void create(@RequestBody Producto producto){ 
		productoServices.create(producto); 
	} 
}