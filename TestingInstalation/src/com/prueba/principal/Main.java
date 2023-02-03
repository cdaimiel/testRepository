package com.prueba.principal;

import java.util.List;

import com.prueba.dao.ProveedorDAO;
import com.prueba.dao.impl.ProveedorDAOImpl;
import com.prueba.model.Proveedor;
import com.prueba.util.FileGenerator;

public class Main {

	public static void main(String[] args) {
		
		ProveedorDAO provDAO=new ProveedorDAOImpl();
		List<Proveedor> listProv=null;
		
		Integer idClient=null;
		
		 if(args.length == 0) {
			 
			 System.out.println("Falta añadir un argumento");
			 System.exit(0);
		 }
		//Si hay mas de un arg se hace algo??
		 else if(args.length>1) {
			 System.out.println("Sobran argumentos");
			 System.exit(0);
		 }else {
			 String idClientStr=args[0];
			 Boolean esNumero=Boolean.TRUE;
			 
			 try {
				 idClient=Integer.parseInt(idClientStr);
		        } catch (NumberFormatException excepcion) {
		        	esNumero = Boolean.FALSE;
		        }
			 
			 if(!esNumero) {
				 System.out.println("El argumento debe ser un numero");
				 System.exit(0);
			 }
			 
			 listProv=provDAO.findProveedores(idClient);
			 
			 if(listProv==null) {
				 System.out.println("Ha habido un error de conexion con la BBDD");
				 System.exit(0);
			 }else if(listProv.size()==0) {
				 System.out.println("El cliente no tiene proveedores asignados");
				 System.exit(0);
			 }else {
				 
				 FileGenerator fg=new FileGenerator();
				 Boolean esCreado=fg.createProveedorFile(listProv);
				 
				 if(!esCreado) {
					 System.out.println("Ha habido un problema creando el fichero");
				 }
				 
			 }
			 
		 }

	}

}
