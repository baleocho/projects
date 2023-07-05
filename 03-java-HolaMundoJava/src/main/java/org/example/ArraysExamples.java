package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExamples {
    public static void main(String[] args) {
        String[] array = {"H", "E", "L", "L", "O"};
        List<String> arrayList;
        arrayList = Arrays.asList(array);
        for (String letter:array) {
            System.out.println(letter);
        }

        System.out.println(array.length);
        System.out.println(arrayList.size());



    }
}
