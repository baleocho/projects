package org.example.ui;

import org.example.model.Doctor;
import org.example.model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    static Object userLogged;
    public static void showMenu(){
        System.out.println("This is the menu");
        int option = 1;
        Scanner scanner = new Scanner(System.in);
        while  (option != 0){
            System.out.println("Select an option to continue");
            System.out.println("1 Doctor");
            System.out.println("2 Patient");
            System.out.println("3 Do somthing");
            System.out.println("0 Exit");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Welcome Doctor");
                    option = 0;
                    authUser(1);
                    break;
                case 2:
                    System.out.println("Welcome Patient");
                    option = 0;
                    authUser(2);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        }
    }

    public void anotherMenu(){
        System.out.println("This is another menu");
    }

    public static void showPatientMenu(){
        System.out.println("This is the Patient menu");
    }
    public static void showDoctorMenu(){
        System.out.println("This is the doctor menu");
    }
    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Generic Doctor 1", "docgene1@gmail.com"));
        doctors.add(new Doctor("Generic Doctor 2", "docgene2@gmail.com"));
        doctors.add(new Doctor("Generic Doctor 3", "docgene3@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Generic Patient 1", "patgene1@gmail.com"));
        patients.add(new Patient("Generic Patient 2", "patgene2@gmail.com"));
        patients.add(new Patient("Generic Patient 3", "patgene3@gmail.com"));

        boolean emailRight = false;

        do{
            System.out.println("Insert your email: ");
            Scanner scan = new Scanner(System.in);
            String email = scan.nextLine();
            if(userType == 1 ){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailRight = true;
                        System.out.println("Logged succesfully");
                        userLogged = d;
                        showDoctorMenu();
                    }
                }
            }
            if(userType == 2){
                for (Patient p: patients) {
                    if(p.getEmail().equals(email)){
                        emailRight = true;
                        System.out.println("Logged succesfully");
                        userLogged = p;
                        showPatientMenu();
                    }

                }
            }

        }while(!emailRight);

    }
}
