package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if(connection != null){
                System.out.println("Conexion hecha");
            }
        }catch(SQLException error){
            System.out.println("Error "+error);
        }
        return connection;
    }
}
