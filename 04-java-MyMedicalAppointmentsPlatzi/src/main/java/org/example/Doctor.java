package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private static int doctorCounter = 0;
    private String speciality;



    Doctor(){
        super();
        doctorCounter++;
    }

    Doctor(String name, String speciality, String email){
        super(name, email);
        doctorCounter++;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println("The Doctor name is: "+ super.getName());
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
