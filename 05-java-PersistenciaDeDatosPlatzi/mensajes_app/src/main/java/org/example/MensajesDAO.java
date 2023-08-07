package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
    public static void createMensajeDB(Mensaje mensaje){
        Conexion conexion = new Conexion();
        try(Connection connection = conexion.getConection()){
            PreparedStatement pstatement = null;
            try {
                String query=``;
            }
        }catch(SQLException error){

        }
    }
    public static void readMensajesDB(){}
    public static void deleteMensajeDB(int id_mensaje){}
    public static void updateMensajeDB(Mensaje mensaje){}
}
