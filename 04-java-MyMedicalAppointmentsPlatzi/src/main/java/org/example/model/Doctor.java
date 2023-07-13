package org.example.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return this.availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + " Speciality:"+speciality + " Available Appointment: "+ availableAppointments.toString();
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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment( String date, String time) {
            try{
                this.date = format.parse(date);
            } catch(ParseException e){
                e.printStackTrace();
            }
            //this.date = date;
            this.time = time;
        }
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

        public String getDate(String date) {
            return format.format(date);
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
