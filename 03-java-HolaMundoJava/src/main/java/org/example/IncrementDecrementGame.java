package org.example;
import java.util.Scanner;

public class IncrementDecrementGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var exit = 0;
        while(exit == 0){
            var lives = 0;
            var entrada = scanner.next();
            System.out.println("You have "+ lives+ " lives");
            System.out.println("Select an option");
            System.out.println("0 - Exit");
            System.out.println("1 - Add a life");
            System.out.println("2 - Quit a life");
            switch (entrada){
                case "0" :
                    exit = 1;
                    break;
                case "1" :
                    lives++;
                            break;
                case "2":
                    lives--;
                    break;
                default:
                    System.out.println("Select an existed option");
            }
        }

    }
}
