package com.calzadoveloz.ecommerce.models;

public class Usuario {
	//definimos atributos
	
	private Integer Id;
	private String Nombre;
	private String nombreUsuario;
	private String Mail;
	private String Telefono;
	private String tipoUsuario;
	private String password;
	
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
