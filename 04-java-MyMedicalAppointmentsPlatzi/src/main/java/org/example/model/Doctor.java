package org.example.model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private static int doctorCounter = 0;
    private String speciality;

    public Doctor(){
        super();
        doctorCounter++;
    }

    public Doctor(String name, String speciality, String email){
        super(name, email);
        doctorCounter++;
        this.speciality = speciality;
    }

    public Doctor(String name, String email){
        super(name, email);
        doctorCounter++;
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

    @Override
    public String toString() {
        return super.toString() + " Speciality:"+speciality + " Available Appointment: "+availableAppointment.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado");
        System.out.println("Hospital: 34");
        System.out.println("Department: 12");
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

        @Override
        public String toString(){
            return " Available at Date: "+date+ " Time:"+time;
        }
    }

}
