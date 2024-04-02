package com.example.unittests;

public class RomanNumeralsKata {

    public static String convert(int number) {
        int[] values = {5,4,1};
        String[] symbols = {"V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

}
