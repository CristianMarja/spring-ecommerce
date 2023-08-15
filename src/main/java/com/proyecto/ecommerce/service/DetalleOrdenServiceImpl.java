package com.proyecto.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.ecommerce.model.DetalleOrden;
import com.proyecto.ecommerce.repository.IDetalleOrdenRepository;

public class DetalleOrdenServiceImpl implements IDetalleOrdenService{

	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {

		return detalleOrdenRepository.save(detalleOrden);
	}

}
