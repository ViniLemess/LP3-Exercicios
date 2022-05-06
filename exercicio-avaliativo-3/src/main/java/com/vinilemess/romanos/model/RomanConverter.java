package com.vinilemess.romanos.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class RomanConverter {

    private static final Map<String, Integer> supportedNumbersMap = new HashMap<>();
    static {
        supportedNumbersMap.put("I", 1);
        supportedNumbersMap.put("II", 2);
        supportedNumbersMap.put("III", 3);
        supportedNumbersMap.put("IV", 4);
        supportedNumbersMap.put("V", 5);
        supportedNumbersMap.put("VI", 6);
        supportedNumbersMap.put("VII", 7);
        supportedNumbersMap.put("VIII", 8);
        supportedNumbersMap.put("IX", 9);
        supportedNumbersMap.put("X", 10);
        supportedNumbersMap.put("XI", 11);
        supportedNumbersMap.put("XII", 12);
        supportedNumbersMap.put("XIII", 13);
        supportedNumbersMap.put("XIV", 14);
        supportedNumbersMap.put("XV", 15);
        supportedNumbersMap.put("XVI", 16);
        supportedNumbersMap.put("XVII", 17);
        supportedNumbersMap.put("XVIII", 18);
        supportedNumbersMap.put("XIX", 19);
        supportedNumbersMap.put("XX", 20);
    }

    private RomanConverter(){}

    public static int turnFromRomanToInt(String romanNumber) {
        if(supportedNumbersMap.containsKey(romanNumber)) {
                return supportedNumbersMap.get(romanNumber);
        }
        throw new IllegalArgumentException("Unsupported roman number!");
    }
    public static Optional<String> turnFromIntToRoman(int arabicNumber) {
        if(supportedNumbersMap.containsValue(arabicNumber)) {
            return getKey(supportedNumbersMap, arabicNumber);
        }

        throw new IllegalArgumentException("Unsupported arabic number!");
    }
    private static Optional<String> getKey(Map<String, Integer> map, Integer value) {
        return map
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .findFirst();
    }
}
