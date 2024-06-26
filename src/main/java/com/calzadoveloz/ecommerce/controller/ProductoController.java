package com.calzadoveloz.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//se mapeara como productos
@RequestMapping("/productos")
public class ProductoController {

	// redireccionamos a la vista showw.html
	@GetMapping("") //cadena vacia para q se mapee a productos
	public String show() {
		return "Productos/show.html";
	}
}
