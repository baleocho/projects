package org.example;

public class DataTypes {
    public static void main(String[] args) {
        int numero = 1234567890;
        long numeroLong = 1234567890131244412L;

        double numeroDouble = 123.45634;
        float numeroFloat = 123.456234F;

        char letra = 'a'; //To add a new value to a char type you should use a simple comillas
        String cadenaDeTexto = "Esto es una cadena de texto";
        String employeeNameString = "Brian Ochoa String";
        boolean onlyTrueOrFalse = false;

        var variableAutomatica = 1;

        //Calculating porcentages
        var salary = 1000; //This is an int
        var fees = salary*0.3333; //This will change to double
        var totalSalary = salary-fees;
        var employeeName = "Brian Ochoa";

        System.out.println(salary);
        System.out.println(fees);
        System.out.println(totalSalary);

        //WRAPPERS
        Integer numeroAcceptNullValue = null;
        //int numeroDontAcceptNullValue = null;

        System.out.println("When you work with var you can concat different var, example:");
        System.out.println("My name is "+employeeName+". And my salary is: "+totalSalary);

        System.out.println("You can also concat variables as int into a string, example");
        System.out.println("My name is "+employeeNameString+". And my salary is: "+numero);



    }
}
