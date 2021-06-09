package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  private static final String INPUT_PROMPT = "Type a Celsius temperature (blank to quit): ";
  private static final String FAHRENHEIT_OUTPUT_FORMAT =
      "Fahrenheit Temperature: %,.2f degrees%nType a Celsius temperature (blank to quit): ";
  private static final String PARSE_EXCEPTION_FORMAT = "Unable to parse \"%s\". Please try again ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print(INPUT_PROMPT);
        String userInput = scanner
            .nextLine()
            .trim() ;
        while (!userInput.isEmpty()) {
          try {
            //TODO Check last character of userInput; if 'f', treat as Fahrenheit; otherwise, Celsius.
            System.out.printf(
                FAHRENHEIT_OUTPUT_FORMAT
                ,convertC2F(Double.parseDouble(userInput)));
          } catch (NumberFormatException e) {
            System.out.printf(PARSE_EXCEPTION_FORMAT, userInput );
          }
          userInput = scanner.nextLine().trim();
    }
  }

  public static double convertC2F(double celsius) {

    return celsius * 9 / 5 + 32;
  }

  public static double convertF2C (double fahrenheit) {

    return 5 * (fahrenheit - 32) / 9; // TODO ensure correct code

  }
}
