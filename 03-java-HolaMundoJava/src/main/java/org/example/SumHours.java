package org.example;

import java.util.List;

public class SumHours {
    public static void main(String[] args) {
        sumHours("12:59", "5:29");
    }

    public static void sumHours(String firstHour, String secondHour){
        String[] firstSpplited = firstHour.split(":");
        String[] secondSpplited = secondHour.split(":");
        Integer firstHours = Integer.parseInt(firstSpplited[0]);
        Integer firstMinutes = Integer.parseInt(firstSpplited[1]);
        Integer secondHours = Integer.parseInt(secondSpplited[0]);
        Integer secondMinutes = Integer.parseInt(secondSpplited[1]);


        double finalMinutes = firstMinutes + secondMinutes;
        double finalHours = firstHours + secondHours + (int)(finalMinutes/60);
        finalMinutes -= 60 * (int)(finalMinutes/60);
        System.out.println((int)finalHours+":"+(int)finalMinutes);

    }
}
