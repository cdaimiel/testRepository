package com.prueba.dao;

import java.util.List;

import com.prueba.model.Proveedor;

public interface ProveedorDAO {
	

	List<Proveedor> findProveedores(Integer idCliente);

}
