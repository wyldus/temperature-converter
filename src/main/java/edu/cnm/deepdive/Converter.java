package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Type a celesius temprature (blank to quit): ");
        String userInput = scanner.nextLine();
        while (!userInput.isEmpty()) {
          try {
            System.out.printf(
                "Farenheit Temperature: %,8.2f degrees%nType a celesius temprature (blank to quit): "
                ,convertC2F(Double.parseDouble(userInput)));
          } catch (NumberFormatException e) {
            System.out.printf("Unable to parse \"%s\". Please try again ", userInput );
          }
          userInput = scanner.nextLine();
    }
  }

  public static double convertC2F(double celsius) {

    return celsius * 9 / 5 + 32;
  }

}
