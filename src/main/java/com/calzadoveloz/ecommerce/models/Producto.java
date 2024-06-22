package com.calzadoveloz.ecommerce.models;

public class Producto {
	//definimos variables
	
	private Integer Id;
	private String Nombre;
	private String Descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	//constructor vacio
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con parametros
	
	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}


//generamos metodo toString para que retorne los campos en un solo  String

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	//getters and setter
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
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
