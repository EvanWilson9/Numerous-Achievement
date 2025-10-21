package edu.bsu.cs;

public class RomanNumeralsConverter {

    public String convertToRomanNumerals(int number){
        StringBuilder romanNumeralString = new StringBuilder();

        if (number == 1000) {
            romanNumeralString.append("M");
        } else if (number == 500) {
            romanNumeralString.append("D");
        } else if (number == 100) {
            romanNumeralString.append("C");
        } else if (number == 50) {
            romanNumeralString.append("L");
        } else if (number == 10) {
            romanNumeralString.append("X");
        } else if (number == 5) {
            romanNumeralString.append("V");
        } else if(number > 0){
            if(number == 4){
                romanNumeralString.append("IV");
            } else {
                romanNumeralString.append("I".repeat(number));
            }
        }

        return String.valueOf(romanNumeralString);
    }
}
