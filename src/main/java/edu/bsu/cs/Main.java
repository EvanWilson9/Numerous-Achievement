package edu.bsu.cs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RomanNumeralsConverter converter = new RomanNumeralsConverter();

        System.out.print("Enter a number [1,3000] to convert to roman numerals: ");
        int numberInput = Integer.parseInt(scanner.nextLine());
        System.out.println(converter.convertToRomanNumerals(numberInput));

    }
}
