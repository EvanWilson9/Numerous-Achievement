package edu.bsu.cs;

public class RomanNumeralsConverter {

    public String convertToRomanNumerals(int number){
        StringBuilder romanNumeralString = new StringBuilder();
        int remainingValue = number;

        if(remainingValue < 1 || remainingValue > 3000){
            return "Number is out of boundaries.";
        }

        while(true) {

            if (remainingValue / 1000 >= 1) {
                romanNumeralString.append("M");
                remainingValue -= 1000;
            } else if (remainingValue / 500 >= 1) {
                romanNumeralString.append("D");
                remainingValue -= 500;
            } else if (remainingValue / 100 >= 1) {
                romanNumeralString.append("C");
                remainingValue -= 100;
            } else if (remainingValue / 50 >= 1) {
                romanNumeralString.append("L");
                remainingValue -= 50;
            } else if (remainingValue / 10 >= 1) {
                romanNumeralString.append("X");
                remainingValue -= 10;
            } else if (remainingValue / 5 >= 1) {
                romanNumeralString.append("V");
                remainingValue -= 5;
            }
            else if (remainingValue == 4) {
                romanNumeralString.append("IV");
                remainingValue -= 4;
                break;
            }
            else if(remainingValue > 0){
                romanNumeralString.append("I".repeat(remainingValue));
                remainingValue -= remainingValue;
                break;
            } else {
                break;
            }
        }

        return String.valueOf(romanNumeralString);
    }
}
