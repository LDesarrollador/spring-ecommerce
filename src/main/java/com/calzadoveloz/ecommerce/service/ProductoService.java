package com.calzadoveloz.ecommerce.service;

import java.util.Optional;

import com.calzadoveloz.ecommerce.models.Producto;

public interface ProductoService {
	
	//este metodo recibire un objeto producto como parametro
	public Producto save(Producto producto);
	//optional, porque nos da la opcion de validar si el objeto 
	//que llamamos de la base de datos, existe o no   
	public Optional<Producto> get(Integer Id);
	//metodo que nos permite actualizar un objeto producto y retorna void
	public void update(Producto produto);
	//metodo q permite eliminar un objeto a travez de un id 
	public void delete(Integer Id);

}
