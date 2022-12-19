package com.guilherme.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[length];
        int count = 0;

        for (int i = 0; i<length; i++) {
            arr[i] = (i+1);
        }

        for(int i: arr) {
            for (int j: arr){
                if ((i-j) == k) count++;
            }
        }
        System.out.println(count);
    }
}
