package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Conexion conexion = new Conexion();
        try{
            Connection cnx = conexion.getConnection();
        }catch(Exception error){
            System.out.println("Error: "+error);
        }
    }
}