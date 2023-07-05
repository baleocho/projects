package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        salary += 500;

        System.out.println("New salary: "+ salary);

        //pension
        salary -= 50;
        System.out.println("Salary minus pension: "+salary);
        System.out.println("Salary minus pension: "+salary);

        String employeeName = "Brian Ochoa";

        employeeName += " Duran";
        System.out.println("Your name is " + employeeName);
        String[] emploteeNameSplitted = employeeName.split(" ");
        List<String> employeeNameCompletted = new ArrayList<>(Arrays.asList(emploteeNameSplitted));
        List<String> employeeNameCompletted2 = new ArrayList<>(Arrays.asList(new String[]{"A", "B", "C", "D"}));
        String lastElem =  employeeNameCompletted.get(0);
        for(int i = 0 ; i < employeeNameCompletted.size(); i++) {
            if(i == 1){
                lastElem =  employeeNameCompletted.get(i);
                employeeNameCompletted.set(i,"Alejandro");
            }else{
                employeeNameCompletted.set(i,lastElem);
            }
        }
        employeeNameCompletted.add(lastElem);
        String relsult = String.join(" ", employeeNameCompletted);
        System.out.println("My full name is: "+ relsult);

    }
}
