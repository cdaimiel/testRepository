package com.prueba.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConexionBBDD {
	
	
	private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE = "testibm?autoReconnect=true&useSSL=false";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";//"com.mysql.jdbc.Driver";
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";
     
    protected Boolean estaConectado=Boolean.TRUE;
    
    protected Connection conn;
    protected Statement stm;

    public void open() {
        conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL + DATABASE, USERNAME, PASSWORD);
            stm = conn.createStatement();
        } catch (SQLException e) {
            System.err.println(e);
            estaConectado=Boolean.FALSE;
        }catch (ClassNotFoundException e){
            System.err.println(e);
            estaConectado=Boolean.FALSE;
        }
    }

    public void close() {
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión :" + e);
        }
    }

    
}
