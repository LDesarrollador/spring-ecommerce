package com.calzadoveloz.ecommerce.models;

import java.util.Date;

public class Orden {
	private Integer Id;
	private String Numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private double total;
	
	//constructor con campos
	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		this.Id = id;
		this.Numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}
	
	//contructor vacio 
public Orden() {
	// TODO Auto-generated constructor stub
}
//toString

@Override
public String toString() {
	return "Orden [Id=" + Id + ", Numero=" + Numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
			+ fechaRecibida + ", total=" + total + "]";
}

//Getters and setter
public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
}

public String getNumero() {
	return Numero;
}

public void setNumero(String numero) {
	Numero = numero;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public Date getFechaRecibida() {
	return fechaRecibida;
}

public void setFechaRecibida(Date fechaRecibida) {
	this.fechaRecibida = fechaRecibida;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}




	

}
