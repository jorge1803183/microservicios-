package com.productos.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productos.dao.IProductosDao;
import com.productos.entities.Producto;
import com.productos.services.IProductoServices;

@Service
public class ProductoServices implements IProductoServices{

	@Autowired
	private IProductosDao productoDao;

	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id) {
		return productoDao.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void create(Producto producto){
		productoDao.save(producto);
	}
}

