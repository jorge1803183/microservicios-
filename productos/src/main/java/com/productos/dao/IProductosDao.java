package com.productos.dao;

import org.springframework.data.repository.CrudRepository;
import com.productos.entities.Producto;

public interface IProductosDao extends CrudRepository<Producto, Long> {

}
