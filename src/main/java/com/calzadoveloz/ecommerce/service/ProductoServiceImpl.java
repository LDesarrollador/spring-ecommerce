package com.calzadoveloz.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calzadoveloz.ecommerce.models.Producto;
import com.calzadoveloz.ecommerce.repository.ProductoRepository;

//anotacion para decir q es un servicio para llamar a los metodos crud
@Service
//implementamos de la interfaz que diseñamos previo
public class ProductoServiceImpl implements ProductoService{
	
	//declarar un objeto de tipo repository para hacer la implementacion de los cruds 
	@Autowired
	private ProductoRepository productoRepository;
	
	//
	@Override
	public Producto save(Producto producto) {
		
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer Id) {
		
		return productoRepository.findById(Id);
	}

	@Override
	public void update(Producto produto) {
		productoRepository.save(produto);
		
	}

	@Override
	public void delete(Integer Id) {
		productoRepository.deleteById(Id);
		
	}
	
	

}
