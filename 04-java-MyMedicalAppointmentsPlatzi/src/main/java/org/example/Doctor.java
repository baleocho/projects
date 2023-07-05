package org.example;

import com.sun.source.doctree.DocTree;

public class Doctor {
    private int id;
    private String name, speciality;

    Doctor(){}

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;

    }

    public void showName(){
        System.out.println("The Doctor name is: "+ this.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
