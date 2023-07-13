package org.example.ui;

import org.example.model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctor {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(Doctor userLogged){
        int response = 0;
        do {
            System.out.println("\n\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome Dr. " + userLogged.getName());
            System.out.println("1. Add available Appointment");
            System.out.println("2. My Scheduled Appointment");
            System.out.println("0. Logout");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu(userLogged);
                    break;
                case 2:
                    System.out.println("::Your available appointmets are:");
                    for (Doctor.AvailableAppointment availableAppointmet:userLogged.getAvailableAppointments()) {
                        System.out.println(availableAppointmet.toString());
                    };
                    break;
                default:
                    System.out.println("Select an available option");
                case 0:
                    UIMenu.showMenu();
            }
        }while(response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(Doctor userLogged){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a month");
            for (int i=0; i<UIMenu.MONTHS.length;i++) {
                System.out.println((i + 1) + ". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());
            if(response > 0 && response < 4){
                int monthSelected = response - 1;
                System.out.println("Month selected: "+ UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = scanner.nextLine();
                System.out.println("Date selected: "+date);
                System.out.println("Insert the time available: [12:00]");
                String time = scanner.nextLine();

                System.out.println("Available Appointment added");

                userLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointment(userLogged);
            }

        }while(response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor){
        if(doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
