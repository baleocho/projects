package org.example;

public class Patient extends User {
    private String blood;
    private double weight, height;

    Patient(String name, String email){
        super(name, email);
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getHeight(){
        return this.height + " Mts.";
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBlood(){
        return this.blood;
    }

}
