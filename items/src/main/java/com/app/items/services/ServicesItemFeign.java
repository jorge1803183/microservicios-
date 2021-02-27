package com.app.items.services;


import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.app.items.clientes.ProductoClienteRest;
import com.app.items.models.Items;

@Service

public class ServicesItemFeign implements IServicesItem {
	
	@Autowired
	private ProductoClienteRest clienteFeign;
	
	@Override
	public java.util.List<Items> findAll() {
		return clienteFeign.listar().stream().map(p -> new Items(p,1)).collect(Collectors.toList());
		
	}
	
	@Override
	public Items findById(Long id, Integer cantidad) {
		return new Items(clienteFeign.ver(id), cantidad);
	}
	
}
