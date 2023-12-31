package com.proyecto.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.ecommerce.model.Producto;
import com.proyecto.ecommerce.service.IOrdenService;
import com.proyecto.ecommerce.service.IUsuarioService;
import com.proyecto.ecommerce.service.ProductoService;


@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IOrdenService ordenService;
	
	@GetMapping("")
	public String home(Model model) {
		
		List<Producto> productos=productoService.findAll();
		model.addAttribute("productos", productos);
		
		return "administrador/home.html";
	}	
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		
		model.addAttribute("usuarios",usuarioService.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		model.addAttribute("ordenes",ordenService.findAll());
		return "administrador/ordenes";
	}
}
