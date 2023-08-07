package org.example;

public class Mensaje {
    int id_mensaje;
    String mensaje, autor_mensaje, fecha;

    public Mensaje(){

    }
    public Mensaje(int id_mensaje, String mensaje, String autor_mensaje, String fecha) {
        this.id_mensaje = id_mensaje;
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha = fecha;
    }
    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
