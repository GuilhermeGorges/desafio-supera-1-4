package com.guilherme.desafio4;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {

    public static List<String> messUp(List<String> sentenceList) {
        List<String> reversedSentences = new ArrayList<>();

        sentenceList.forEach(sentence -> {
            String firstHalf = sentence.substring(0, (sentence.length()/2));
            String lastHalf = sentence.substring((sentence.length()/2));
            reversedSentences.add(reverse(firstHalf) + reverse(lastHalf));
        });
        return reversedSentences;
    }

    private static String reverse(String sentence) {
        String  returnSentence = new StringBuilder(sentence).reverse().toString();
        return returnSentence;
    }

}
