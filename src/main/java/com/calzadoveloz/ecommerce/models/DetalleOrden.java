package com.calzadoveloz.ecommerce.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
@Table(name = "detallesOrden")
public class DetalleOrden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Nombre;
	private double Cantidad;
	private double Precio;
	private double total;
	
	//relacion con orden
	@OneToOne
	private Orden orden;
	
	//relacion con producto, ya que muchos productos o 1 pueden estar en el detalle
	@ManyToOne
	private Producto producto;
	
	//contructor vacio
	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}
	

	//contructor usando parametros
	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Cantidad = cantidad;
		this.Precio = precio;
		this.total = total;
	}

	//getters and setters
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getCantidad() {
		return Cantidad;
	}

	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}


	public Orden getOrden() {
		return orden;
	}


	public void setOrden(Orden orden) {
		this.orden = orden;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
	
}
