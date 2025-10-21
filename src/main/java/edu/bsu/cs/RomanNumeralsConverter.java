package edu.bsu.cs;

public class RomanNumeralsConverter {

    public String convertToRomanNumerals(int number){
        StringBuilder romanNumeralString = new StringBuilder();

        if(number > 0){
            romanNumeralString.append("I".repeat(number));
        }

        return String.valueOf(romanNumeralString);
    }
}
