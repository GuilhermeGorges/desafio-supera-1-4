package com.guilherme.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddOrEvenSort {

    public static void print(List<Integer> numberList) {
        numberList.forEach(System.out::println);
    }

    public static List<Integer> evenOrOddSort(List<Integer> numberList) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        numberList.forEach(num -> {
            if(isEven(num)) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        });

        numberList.clear();

        Collections.sort(evenList);

        numberList.addAll(evenList);
        numberList.addAll(reverseSort(oddList));

        return numberList;
    }

    private static boolean isEven(Integer num) {
        return (num % 2) == 0;
    }

    private static List<Integer> reverseSort(List<Integer> number) {
        List<Integer> returnList = new ArrayList<>();
        Collections.sort(number);

        for(int i = (number.size() - 1);i >= 0; i--) {
            returnList.add(number.get(i));
        }
        return returnList;
    }

}
