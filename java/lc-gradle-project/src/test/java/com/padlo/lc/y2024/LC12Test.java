package com.padlo.lc.y2024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC12Test {

    @Test
    void intToRoman() {
        assertEquals("III", LC12.intToRoman(3));
        assertEquals("IV", LC12.intToRoman(4));
        assertEquals("IX", LC12.intToRoman(9));
        assertEquals("LVIII", LC12.intToRoman(58));
        assertEquals("MCMXCIV", LC12.intToRoman(1994));
    }
}