package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaracion de una variable
        int speed = 10;
        int salary = 1000;
        String employeeName = "Brian Ochoa";

        System.out.println("Hello world!: " + employeeName);


        Scanner scanner = new Scanner(System.in);
        //int controller = scanner.nextInt();
        //switch(controller){
        //    case 1: System.out.println("Number 1 selected"); break;
        //}

        System.out.println("Nums sum: "+sumNums(1,2));
    }
    public static int sumNums(int num1, int num2){
        return num1 + num2;
    }
}