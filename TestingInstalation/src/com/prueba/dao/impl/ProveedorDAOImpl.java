package com.prueba.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.prueba.conection.ConexionBBDD;
import com.prueba.dao.ProveedorDAO;
import com.prueba.model.Proveedor;

public class ProveedorDAOImpl extends ConexionBBDD implements ProveedorDAO  {

	@Override
	public List<Proveedor> findProveedores(Integer idCliente) {
		 ArrayList<Proveedor> provList = new ArrayList<>();
        open();
        
        if(estaConectado) {
        	
        	 try {
 	            ResultSet rs;

 	            PreparedStatement stm =  conn.prepareStatement("SELECT p.id_proveedor,p.nombre, p.fecha_alta,p.id_cliente FROM proveedores as p "
 	                + " WHERE p.id_cliente = ?" );
 	            
 	            stm.setInt(1, idCliente);
 	            
 	            rs = stm.executeQuery();
 	           
 	            while (rs.next()) {
 	            	
 	            	Proveedor prov = new Proveedor();
 	            	
 	                prov.setIdProveedor(rs.getInt("id_proveedor"));
 	                prov.setNombreProv(rs.getString("nombre"));
 	                prov.setFechaAlta(rs.getDate("fecha_alta"));
 	                prov.setIdCliente(rs.getInt("id_cliente"));
 	                
 	                
 	                provList.add(prov);
 	            }
 	        } catch (SQLException e) {
 	            System.err.println("Error al listar proveedores: \n" + e.getMessage());
 	        } 
        	 
        	 close();
        	 
        	 
        	 return provList;
        	 
        }else {
        	
        	return null;
        }
	       
        
        
	}

}
