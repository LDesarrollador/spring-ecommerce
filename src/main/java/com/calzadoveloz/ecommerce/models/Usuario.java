package com.calzadoveloz.ecommerce.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//siguiente paso, agregamos anotaciones para jpa
@Entity
@Table(name = "Usuarios")//opcional para que se mapee en la db de  Usuario a Usuarios
public class Usuario {
	//definimos atributos
	@Id  //para q en la bd sea el id autoincrementable
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer Id;
	private String Nombre;
	private String nombreUsuario;
	private String Mail;
	private String Telefono;
	private String tipoUsuario;
	private String password;

	//crearemos la lista de productos para un usuario
	//crearemos el atributo de la  clase producto que nos devuelva la lista de productos
	//tambien para acceder, incluimos su getter and setter
	
	//agregamos la anotacion para decir que 1 usuario se relaciona con
	//muchos productos usando el parametro usuario
	@OneToMany(mappedBy = "usuario")
	private List<Producto>producto;
	
	
	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	//ordenes
	
	@OneToMany(mappedBy = "usuario")
	private List<Orden>ordenes;
	
	

	public List<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}

	//generamos constructor sin parametros
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generamos constructor con parametros
	
	public Usuario(Integer id, String nombre, String nombreUsuario, String mail, String telefono, String tipoUsuario,
			String password) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.Mail = mail;
		this.Telefono = telefono;
		this.tipoUsuario = tipoUsuario;
		this.password = password;
	}
	
	

//generamos toString

	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", Nombre=" + Nombre + ", nombreUsuario=" + nombreUsuario + ", Mail=" + Mail
				+ ", Telefono=" + Telefono + ", tipoUsuario=" + tipoUsuario + ", password=" + password + "]";
	}
	//generamos gettes y setters

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
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
