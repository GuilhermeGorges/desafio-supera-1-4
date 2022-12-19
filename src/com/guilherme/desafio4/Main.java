package com.guilherme.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INPUT_NUM;
        Scanner scan = new Scanner(System.in);
        List<String> sentenceList = new ArrayList<>();
        List<String> reversedSentenceList = new ArrayList<>();

        INPUT_NUM = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < INPUT_NUM; i++) {
            sentenceList.add(scan.nextLine());
        }

        reversedSentenceList.addAll(ReverseSentence.messUp(sentenceList));
        reversedSentenceList.forEach(System.out::println);

    }
}
