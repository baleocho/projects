package org.example;

import static java.lang.Float.parseFloat;

public class MathOperations {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //Return an integer to the upper
        System.out.println("ceil: " +Math.ceil(x));

        System.out.println("Floor: "+Math.floor(x));

        System.out.println("To the potencia: " +Math.pow(x,y));

        System.out.println("Return the max num: "+Math.max(x,y));

        System.out.println("Return the raiz cuadrada: "+Math.sqrt(x));

        //Area circulo
        //PI * r^2
        //r = y = 3
        System.out.println("Area de un circulo: " + String.format("%.2f", (Math.PI * Math.pow(y,2))) );

        //Area de una esfera
        //4*PI*r^2
        var resultArea = String.format("%.2f", (4*Math.PI*Math.pow(y,2)) );
        System.out.println("Area de una esfera: "+ resultArea );

        //Volumen de una esfera
        //(4/3)PI * r^3
        System.out.println("Volumen de una esfera: "+ String.format("%.2f", ((4/3) * Math.PI * Math.pow(y,3))));
    }
}
