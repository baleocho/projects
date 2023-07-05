package org.example;

public class Patient {
    int id;
    private String name, email, address, phoneNumber, birthday, blood;
    private double weight, height;

    Patient(String name, String email){
        this.name  = name;
        this.email = email;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getBirthday(){
        return  this.birthday;
    }
    public String getWeight(){
        return this.weight + " Kg.";
    }
    public String getHeight(){
        return this.height + " Mts.";
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 10 ) {
            System.out.println("El numero telefonico debe ser de 10 digitos");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
