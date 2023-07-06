package org.example;

import com.sun.source.doctree.DocTree;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id = 0;
    private String name, speciality;

    Doctor(){}

    Doctor(String name, String speciality){
        id++;
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

    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointment.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return this.availableAppointment;
    }

    public static class AvailableAppointment {
        private int idAvailableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment( Date date, String time) {
            this.date = date;
            this.time = time;
        }
        public int getIdAvailableAppointment() {
            return idAvailableAppointment;
        }

        public void setIdAvailableAppointment(int idAvailableAppointment) {
            this.idAvailableAppointment = idAvailableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
