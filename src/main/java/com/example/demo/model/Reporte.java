package com.example.demo.model;

import java.math.BigDecimal;

public class Reporte {
	
	public Long id;
	public String nombre;
	public BigDecimal precio;
	
	public Reporte(Long id, String nombre, BigDecimal precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
}

