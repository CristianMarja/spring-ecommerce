package com.proyecto.ecommerce.service;

import java.util.List;

import com.proyecto.ecommerce.model.Orden;
import com.proyecto.ecommerce.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save(Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
