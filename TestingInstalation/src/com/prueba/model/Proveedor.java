package com.prueba.model;

import java.util.Date;

public class Proveedor {

	
	private Integer idProveedor;
	private String nombreProv;
	private Date fechaAlta;
	private Integer idCliente;
	
	public Proveedor() {
		super();
	}

	public Proveedor(Integer idProveedor, String nombreProv, Date fechaAlta, Integer idCliente) {
		super();
		this.idProveedor = idProveedor;
		this.nombreProv = nombreProv;
		this.fechaAlta = fechaAlta;
		this.idCliente = idCliente;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProv() {
		return nombreProv;
	}

	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
		
}
