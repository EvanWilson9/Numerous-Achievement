package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {
    @Test
    public void convertRomanNumeralOne(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("I", converter.convertToRomanNumerals(1));
    }

    @Test
    public void convertRomanNumeralThree(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("III", converter.convertToRomanNumerals(3));
    }

    @Test
    public void convertRomanNumeralFour(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("IV", converter.convertToRomanNumerals(4));
    }

    @Test
    public void convertRomanNumeralFive(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("V", converter.convertToRomanNumerals(5));
    }

    @Test
    public void convertRomanNumeralTen(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("X", converter.convertToRomanNumerals(10));
    }

    @Test
    public void convertRomanNumeralFifty(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("L", converter.convertToRomanNumerals(50));
    }

    @Test
    public void convertRomanNumeralOneHundred(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("C", converter.convertToRomanNumerals(100));
    }

    @Test
    public void convertRomanNumeralFiveHundred(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("D", converter.convertToRomanNumerals(500));
    }

    @Test
    public void convertRomanNumeralOneThousand(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("M", converter.convertToRomanNumerals(1000));
    }

    @Test
    public void convertRomanNumeralFourteen(){
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        Assertions.assertEquals("XIV", converter.convertToRomanNumerals(14));
    }
}
