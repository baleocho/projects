package org.example;

import java.util.Scanner;

public class UIGeneral {
    public static void getUI(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("---------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("---------------------");
                    System.out.println("Crear mensaje");
                    MensajesService.createMensaje();
                    break;
                    case 2:
                        System.out.println("---------------------");
                        System.out.println("Listar mensajes");
                MensajesService.listMensajes();
                break;
                  case 3:
                      System.out.println("---------------------");
                      System.out.println("Editar mensaje");
                      MensajesService.editMensaje();
                break;
                  case 4:
                      System.out.println("---------------------");
                      System.out.println("Eliminar mensaje");
                      MensajesService.deleteMensaje();
                break;
                     case 0:
                         System.out.println("Hasta luego");
                break;
                default:
                    break;

            }

        }while(option != 0);
    }
}
