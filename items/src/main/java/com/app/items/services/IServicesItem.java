package com.app.items.services;

import java.util.List;

import org.springframework.context.annotation.Primary;

import com.app.items.models.Items;
@Primary
public interface IServicesItem {
	
	public List<Items> findAll();
	
	public Items findById(Long id, Integer cantidad);
	
}
