package com.example.unittests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanNumeralsKataTests {

    @Test
    void RomanNumeralKata1() {
        assertEquals("I", RomanNumeralsKata.convert(1));
    }

    @Test
    void RomanNumeralKata2() {
        assertEquals("II", RomanNumeralsKata.convert(2));
    }

    @Test
    void RomanNumeralKata3() {
        assertEquals("III", RomanNumeralsKata.convert(3));
    }

    @Test
    void RomanNumeralKata4() {
        assertEquals("IV", RomanNumeralsKata.convert(4));
    }

    @Test
    void RomanNumeralKata5() {
        assertEquals("V", RomanNumeralsKata.convert(5));
    }
    @Test
    void RomanNumeralKata6() {
        assertEquals("VI", RomanNumeralsKata.convert(6));
    }
    @Test
    void RomanNumeralKata7() {
        assertEquals("VII", RomanNumeralsKata.convert(7));
    }
    @Test
    void RomanNumeralKata8() {
        assertEquals("VIII", RomanNumeralsKata.convert(8));
    }
    @Test
    void RomanNumeralKata9() {
        assertEquals("IX", RomanNumeralsKata.convert(9));
    }
    @Test
    void RomanNumeralKata10() {
        assertEquals("X", RomanNumeralsKata.convert(10));
    }
    @Test
    void RomanNumeralKata25() {
        assertEquals("XXV", RomanNumeralsKata.convert(25));
    }
    @Test
    void RomanNumeralKata50() {
        assertEquals("L", RomanNumeralsKata.convert(50));
    }
    @Test
    void RomanNumeralKata100() {
        assertEquals("C", RomanNumeralsKata.convert(100));
    }
    @Test
    void RomanNumeralKata500() {
        assertEquals("D", RomanNumeralsKata.convert(500));
    }
    @Test
    void RomanNumeralKata1000() {
        assertEquals("M", RomanNumeralsKata.convert(1000));
    }
    @Test
    void RomanNumeralKata3411() {
        assertEquals("MMMCDXI", RomanNumeralsKata.convert(3411));
    }
    @Test
    void RomanNumeralKata0() {
        assertEquals("0 is not a roman number", RomanNumeralsKata.convert(0));
    }
}