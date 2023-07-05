package org.example;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("Area de un circulo: " + String.format("%.2f", circleArea(2)) );
    }
    //Area circulo
    //PI * r^2
    //r = y = 3
    public static double circleArea(double r){
        return (Math.PI * Math.pow(3,r));
    }

}
