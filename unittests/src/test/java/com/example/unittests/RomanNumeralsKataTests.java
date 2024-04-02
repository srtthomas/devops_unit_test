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
        assertEquals("V", RomanNumeralsKata.convert(6));
    }
    @Test
    void RomanNumeralKata7() {
        assertEquals("V", RomanNumeralsKata.convert(7));
    }
}