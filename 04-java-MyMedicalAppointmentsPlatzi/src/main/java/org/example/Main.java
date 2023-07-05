package org.example;
import static org.example.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Dr. Gonzalez", "Pediatra");
        //myDoctor.setName("Dr. Gonzalez");
        myDoctor.showName();

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

        System.out.println("--------------ARRAY OF OBJECTS WITH PRIMITAVES-------------");
        Object[] arrayObjects2 = new Object[3];
        arrayObjects[0] ="Hello world";
        arrayObjects[1] = 123;
        arrayObjects[2] = 123.34;

        for (Object item:arrayObjects2) {
            System.out.println(item);
        }


    }
}