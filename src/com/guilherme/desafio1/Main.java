package com.guilherme.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int INPUT_NUM;
        Scanner scan = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        List<Integer> orderNumberList;

        INPUT_NUM = scan.nextInt();

        for (int i = 0; i < INPUT_NUM; i++) {
            numberList.add(scan.nextInt());
        }

        orderNumberList = OddOrEvenSort.evenOrOddSort(numberList);
        OddOrEvenSort.print(orderNumberList);
    }
}
