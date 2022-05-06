package com.vinilemess.romanos.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {

    private List<String> romanNumbers = new ArrayList<>();
    private List<Integer> arabicNumbers = new ArrayList<>();

    @BeforeEach
    void init() {
        Collections.addAll(romanNumbers, "I", "II", "III", "IV", "V", "VI", "VII", "VIII",
                "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX");
        for (int i = 1; i <= 20; i++) {
            arabicNumbers.add(i);
        }
    }
    @Test
    void shouldTurnRomanToIntFromONeToTwenty() {
        List<Integer> convertedNumbers = new ArrayList<>();
        for(String str : romanNumbers) {
            convertedNumbers.add(RomanConverter.turnFromRomanToInt(str));
        }
        assertEquals(arabicNumbers, convertedNumbers);
    }
    @Test
    void shouldNotTurnRomanToIntWhenNumberIsUnsupported() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.turnFromRomanToInt("XXI");
        });
        assertEquals("Unsupported roman number!", exception.getMessage());
    }
    @Test
    void shouldTurnIntToRomanFromOneToTwenty() {
        List<String> convertedNumbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            convertedNumbers.add(RomanConverter.turnFromIntToRoman(i).get());
        }
        assertEquals(romanNumbers, convertedNumbers);
    }
    @Test
    void shouldNotTurnIntToRomanWhenNumberIsUnsupported() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanConverter.turnFromIntToRoman(21);
        });
        assertEquals("Unsupported arabic number!", exception.getMessage());
    }
}
