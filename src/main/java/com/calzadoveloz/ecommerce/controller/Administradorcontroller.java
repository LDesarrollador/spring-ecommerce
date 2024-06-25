package com.calzadoveloz.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//indicamos que es controllador para que spring framwork 
//lo reconozca como tal
@Controller
@RequestMapping("/administrador")
public class Administradorcontroller {
//mapeamos el home
	@GetMapping("")
	public String home() {
		//retornamos la ruta del home que esta en administrador
		return "administrador/home";
	}
}
