package com.productos.services;

import java.util.List;
import java.util.Optional;

import com.productos.entities.Producto;

public interface IProductoServices {

	public List<Producto> findAll();

	public Optional<Producto> findById(Long id);

	public void create(Producto producto);

}
