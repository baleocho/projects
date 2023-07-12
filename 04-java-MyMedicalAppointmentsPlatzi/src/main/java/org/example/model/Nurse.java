package org.example.model;

public class Nurse extends User {

    private String speciality;

    public Nurse(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado");
        System.out.println("Hospital: 34");
        System.out.println("Department: Nutriolgist");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
