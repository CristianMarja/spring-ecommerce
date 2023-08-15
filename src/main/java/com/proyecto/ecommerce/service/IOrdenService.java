package com.proyecto.ecommerce.service;

import java.util.List;

import com.proyecto.ecommerce.model.Orden;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save(Orden orden);
}
