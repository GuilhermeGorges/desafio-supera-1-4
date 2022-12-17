package com.guilherme.desafio2;

import java.util.*;

public class MoneyChangeCalculator {


    private static final List<Integer> NOTES_LIST = new ArrayList<>(Arrays.asList(
            100,
            50,
            20,
            10,
            5,
            2,
            1));

    private static final List<Integer> COINS_LIST = new ArrayList<>(Arrays.asList(
            50,
            25,
            10,
            5,
            1));

    public static  Map<String,Integer> banknoteCount2(double value) {
        Map<String, Integer> hashNote = new HashMap<>();

       for (Integer note : NOTES_LIST) {
           if (value > note) {
               hashNote.put((note.toString() + ".00"), (int) (value / note));
               value = (value % note);
           } else {
               hashNote.put((note.toString() + ".00"), 0);
           }
       }
       value = (value*100);

        for (Integer coin : COINS_LIST) {
            if (value > coin) {
                hashNote.put(("0." + coin.toString()), (int) (value / coin));
                value = (value % coin);
            } else {
                hashNote.put(("0." + coin.toString()), 0);
            }
        }
        return hashNote;
    }

    public static void printWallet(Map<String,Integer> wallet) {
        System.out.println("NOTAS:");
        NOTES_LIST.forEach(note -> {
            if (note != 1) {
                System.out.printf("%-5d notas(s)     de       R$ %10s\n",
                        wallet.get((note.toString() + ".00")),
                        (note.toString() + ".00"));
            } else {
                System.out.println("MOEDAS:");
                System.out.printf("%-5d moedas(s)     de       R$ %9s\n",
                        wallet.get((note.toString() + ".00")),
                        (note.toString() + ".00"));
            }
        });
        COINS_LIST.forEach(coin -> {
            System.out.printf("%d     moedas(s)     de       R$ %9s\n",
                    wallet.get(("0." + coin.toString())),
                    coin < 10 ? ("0.0" + coin.toString()) : ("0." + coin.toString()));
        });

    }
}
