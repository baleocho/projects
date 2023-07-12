package org.example;
import org.example.model.*;
import org.example.ui.UIMenu;

import java.util.Date;

import static org.example.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------CREATING AND USING A DOCTOR OBJECT---------------");
        Doctor myDoctor = new Doctor("Dr. Gonzalez", "Pediatra", "dremail@email.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        //myDoctor.setName("Dr. Gonzalez");
        myDoctor.showName();
        System.out.println("All of the addAvailable Appointment are: ");
        for (Doctor.AvailableAppointment item:myDoctor.getAvailableAppointment()) {
            System.out.println("Have an Available appointment in: "+item.getDate()+ " at: "+item.getTime());
        }

        System.out.println("------------EXAMPLES AND TESTS---------------");
        Doctor doctores[] = new Doctor[10];
        showMenu();
        System.out.println("Hello world!");
        System.out.println(doctores.length);
        int i=1, j=2, k=3, m=2; System.out.println ((j >= i) || (k == m));

        Patient patient = new Patient("Alejandro", "brian16ochoa@gmail.com");
        patient.setWeight(78.5);
        patient.setPhoneNumber("123456789");
        patient.getPhoneNumber();

        System.out.println(patient.getWeight());


        System.out.println("------------PRIMITIVE TYPES---------------");
        int i2 = 0;
        int i3 = 1;
        i3 = i2;
        System.out.println("Original: "+ i2 + " Assigned: "+i3);
        i3=2;
        System.out.println("Original: "+ i2 + " Assigned and modified: "+i3);

        System.out.println("--------------WRAPPER INTEGER-------------");
        Integer integer2 = 0;
        Integer integer3 = 1;
        integer3 = integer2;
        System.out.println("Original: "+ integer2 + " Assigned: "+integer3);
        integer3=2;
        System.out.println("Original: "+ integer2 + " Assigned and modified: "+integer3);

        System.out.println("--------------OBJECT PATIENT-------------");
        Patient patient1 = new Patient("Alejandro", "brian16ochoa@gmail.com");
        Patient patient2 = new Patient("Alex", "brian16ochoa@gmail.com");
        patient2 = patient1;
        System.out.println("Original: "+ patient1.getName() + " Assigned: "+patient2.getName());
        patient2.setName("Brian");
        System.out.println("Original: "+ patient1.getName() + " Assigned: "+patient2.getName());


        System.out.println("--------------ARRAY OF OBJECTS WITH WRAPPERS-------------");

        Object[] arrayObjects = new Object[3];
        arrayObjects[0] = new String("Hello world");
        arrayObjects[1] = new Integer(123);
        arrayObjects[2] = new Double(123.34);

        for (Object item:arrayObjects) {
            System.out.println(item);
        }

        System.out.println("--------------ARRAY OF OBJECTS WITH PRIMITIVES-------------");
        Object[] arrayObjects2 = new Object[3];
        arrayObjects[0] ="Hello world";
        arrayObjects[1] = 123;
        arrayObjects[2] = 123.34;

        for (Object item:arrayObjects2) {
            System.out.println(item);
        }

        System.out.println("--------------ENUM FROM ENUMEXAMPLES CLASS-------------");
        System.out.println("This enum have a ordinal num: "+ EnumExamples.Day.FRIDAY.ordinal());
        System.out.println("Today is: "+ EnumExamples.Day.FRIDAY);
        System.out.println("Today is on Spanish: "+ EnumExamples.Day.FRIDAY.getSpanish());
        System.out.println("Today is on English: "+ EnumExamples.Day.FRIDAY.getEnglish());


        System.out.println("-------------TO STRING METHOD OVERRIEDED-------------");
        System.out.println(patient);

        System.out.println("");
        System.out.println(myDoctor);

        System.out.println("-------------ABSTRACT METHODS-------------");
        User doctorAbst = new Doctor("Dr. Gonzalez Abstracto", "Pediatra", "dremailabst@email.com");
        User nurseAbst = new Nurse("Anahi abstracta", "anahiabst@gmail.com");
        User patientAbst = new Patient("Paciente Abstracto", "abstractpatioent@gmail.com");

        doctorAbst.showDataUser();
        System.out.println("");
        nurseAbst.showDataUser();
        System.out.println("");
        patientAbst.showDataUser();

        AppointmentDoctor appointmentDoctor = new AppointmentDoctor();
        appointmentDoctor.printByDefault();


        System.out.println("-------------ANONYMOUS CLASSES-------------");
        User userAnon = new User("Anonymous User", "anouemail@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Empleado");
                System.out.println("Hospital: 34");
                System.out.println("Showing Anonymous Information");
            }
        };
        userAnon.showDataUser();


        ISchedulable ischedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println();
            }
        };


        System.out.println("\n\n\n-------------UI MENU-------------");
        UIMenu.showMenu();

    }
}