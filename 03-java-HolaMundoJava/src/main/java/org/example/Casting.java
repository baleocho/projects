package org.example;

public class Casting {
    public static void main(String[] args) {
        int numeroEntero = 12;
        double numeroDouble = numeroEntero;
        int numeroEnteroDouble = (int) numeroDouble;

        System.out.println("numeroEntero, "+numeroEntero);
        System.out.println("numeroDouble, "+numeroDouble);
        System.out.println("numeroEnteroDouble, "+numeroEnteroDouble);
        System.out.println("Numero resultado de division, "+ String.format("%.2f", (float) (10/3) ) );

        char n = '@';
        int ascii = n;

        System.out.println("Num ascii of @: "+ ascii);

        short nShort = (short) ascii;
        System.out.println("Num short from a int castted: "+nShort);



    }
}
