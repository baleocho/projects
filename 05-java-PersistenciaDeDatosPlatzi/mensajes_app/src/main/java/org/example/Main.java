package org.example;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        try{
            Connection cnx = conexion.getConection();

        }catch (Exception error){
            System.out.println("Main,Error: "+error);
        }
        UIGeneral.getUI();
    }


}