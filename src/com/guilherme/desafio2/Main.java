package com.guilherme.desafio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        if (input.contains(",")) {
            input = input.replace(",", ".");
        }

        MoneyChangeCalculator.printWallet(MoneyChangeCalculator.banknoteCount2(Double.parseDouble(input)));

    }
}
