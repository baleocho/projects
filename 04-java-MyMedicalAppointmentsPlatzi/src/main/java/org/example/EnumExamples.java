package org.example;

public class EnumExamples {
    enum Transport {
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        int speed;

        Transport(int s){
            speed = s;
        }
    }

    public enum Day {
        MONDAY("Lunes", "Monday"),
        TUESDAY("Jueves", "Tuesday"),
        FRIDAY("Viernes", "Friday"),
        SATURDAY("Sábado", "Saturday"),
        SUNDAY("Domingo", "Sunday");

        private String spanish, english;
        private Day(String s, String e) {
            spanish = s;
            english = e;
        }

        public String getSpanish() {
            return spanish;
        }
        public String getEnglish() {
            return english;
        }
    }
/*
    public static void main(String[] args) {
        Transport tp = Transport.PLANE;

        if(tp == Transport.PLANE){
            System.out.println("Your enum is a PLANE");
            System.out.println("And have a speed of: "+Transport.PLANE.speed);
        }
    }
    */

}
