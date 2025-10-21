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
}
