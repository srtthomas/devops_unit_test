package com.example.unittests;

public class RomanNumeralsKata {

    public static String convert(int number) {

        if (number == 1) {
            return "I";
        } else if (number == 2) {
            return "II";
        }
        else if (number == 3)
        {
            return "III";
        }
        return "";
    }

}
