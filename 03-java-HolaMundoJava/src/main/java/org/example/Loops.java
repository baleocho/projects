package org.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Integer option = 0;
        do {
            System.out.println("Ingresa una opcion");
            System.out.println("1. Movie");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            Scanner scan = new Scanner(System.in);
            option = Integer.valueOf(scan.nextLine());

            System.out.println(optionValue(option));
        }while(option != 0);
    }

    public static String optionValue(Integer option){
        switch (option){
            case 1:
                return "Your option was Movies";

            case 2:
                return "Your option was Series";

            case 0:
                return "Leaving...";

            default:
                return  "Choice a valid option";

        }
    }
}
