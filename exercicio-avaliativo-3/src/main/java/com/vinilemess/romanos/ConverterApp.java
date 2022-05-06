package com.vinilemess.romanos;

import com.vinilemess.romanos.model.RomanConverter;

import java.util.Scanner;

public class ConverterApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run == true) {
            System.out.println("Type the letter for the intended operation:");
            System.out.println("A - Turn roman to arabic");
            System.out.println("B - Turn arabic to roman");
            System.out.println("C - Exit");
            String operation = scanner.next();

            switch (operation.toUpperCase()) {
                case "A" -> {
                    Thread.sleep(15);
                    System.out.println("Type the roman you intend to convert:");
                    String roman = scanner.next();
                    try {
                        System.out.println(RomanConverter.turnFromRomanToInt(roman));
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case "B" -> {
                    Thread.sleep(15);
                    System.out.println("Type the arabic you intend to convert:");
                    int arabic = scanner.nextInt();
                    try {
                        System.out.println(RomanConverter.turnFromIntToRoman(arabic).get());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case "C" -> run = false;

                default -> {
                    Thread.sleep(15);
                    System.err.println("Unsupported! Please Type a valid operation.");
                }
            }
        }
        System.out.println("Finished");
    }
}
