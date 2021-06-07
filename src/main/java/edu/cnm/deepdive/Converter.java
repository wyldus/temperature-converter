package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type a celesius temprature (blank to quit): ");
    String userInput = scanner.nextLine();
    while (!userInput.isEmpty()) {
      System.out.print("Farenheit Temperature :");
      System.out.println(convertC2F(Double.parseDouble(userInput)));
      System.out.print("Type a celesius temprature (blank to quit): ");
      userInput = scanner.nextLine();
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

}
