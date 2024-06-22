package com.calzadoveloz.ecommerce.models;

public class DetalleOrden {

	private Integer Id;
	private String Nombre;
	private double Cantidad;
	private double Precio;
	private double total;
	
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
	
	
	
	
}
