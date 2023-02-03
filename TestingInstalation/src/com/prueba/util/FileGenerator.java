package com.prueba.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import com.prueba.model.Proveedor;

public class FileGenerator {
	
	private String ruta = "./src/com/prueba/file/FileListProveedores.txt";
    private String contenido = "id_proveedor|nombre|fecha_alta|id_cliente\n";//Traer con: show COLUMNS FROM proveedores; ?

	public FileGenerator() {
		super();
	}
	
	
	public Boolean createProveedorFile(List<Proveedor> proveedorList) {
	
		Boolean esCreado=Boolean.TRUE;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for(Proveedor prov : proveedorList) {
			
			contenido+=prov.getIdProveedor().toString()+"|";
			contenido+=prov.getNombreProv()+"|";
			contenido+=sdf.format(prov.getFechaAlta())+"|";
			contenido+=prov.getIdCliente().toString()+"\n";
			
		}
		
		try {
            
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
        	esCreado=Boolean.FALSE;
        	//System.out.println("Ha habito un problema creando el fichero: "+ e.getMessage());
            
        }
		
		return esCreado;
	}
}
