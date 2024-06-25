package com.calzadoveloz.ecommerce.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Productos")
public class Producto {
	//definimos variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Id;
	private String Nombre;
	private String Descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	//nuevo atributo de tipo Usuario para relacionar con producto
	
	//mapeo con jpa de muchos productos a un usuario
	@ManyToOne
	private Usuario usuario;
	

	//constructor vacio
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con parametros
	
   //lo elimine para luego crear con tipo usuario

//generamos metodo toString para que retorne los campos en un solo  String

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
//constructor incluyendo usuario
	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad,
			Usuario usuario) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
		this.usuario = usuario;
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
	
	///generate getter  y setters  para Usuario

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
