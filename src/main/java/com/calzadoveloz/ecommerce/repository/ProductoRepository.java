package com.calzadoveloz.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calzadoveloz.ecommerce.models.Producto;
//agregamos la anotación
@Repository
//extendemos JpaRepository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	

}
