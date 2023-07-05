package org.example;

public class Exercise {
    public static void main(String[] args){
        char c = 'z';
        System.out.println("Casting my char to int. Char value: "+c + " And chart value on int: "+ (int) c);

        int i = 250;
        System.out.println("Casting my int: "+ i + " To a long: "+ (long) i + " And finally to a short: "+ (short) i);

        double d = 301.067;
        System.out.println("Casting my double: "+ d +" To a long: "+ (long) d);

        int in = 100; //súmale 5000.66 y conviertelo a float
        System.out.println("Casting to float and summing to my int: "+ in + " plus: "+5000.66 + " = "+ (float) (in+5000.66) + " Result without casting: "+ (in+5000.66));

        int inte = 737;
        int newNum = inte * 100;
        System.out.println("Multiply my number: "+inte+ " by 100, equals to: "+ newNum + " And finally I will cast it to a byte: "+ (byte) newNum);

        double dou = 298.638;
        double douDivied = dou/25;
        System.out.println("I will divide my double: " + dou+" by 25: "+douDivied+ "  And I will to cast it to a long: "+(long) douDivied);
    }
}
