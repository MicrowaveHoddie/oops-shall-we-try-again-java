package org.example;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);

    public int getInput(String prompt, String alert, int low, int high) {
        int value;

        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                String lowerCaseInput = input.toLowerCase();
                if (lowerCaseInput.equals("default")){
                    value = 100;
                } else if (lowerCaseInput.equals("exit")) {
                    value = -1;
                  return value;
                } else {
                    value = Integer.parseInt(lowerCaseInput);
                }

                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println(alert);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }
    }

  public static void main(String[] args) {
    // Test your function here in a driver program
      App app = new App();
      int result = app.getInput("Enter a number between 1 and 100, \"default\" for default value of 100, or \"exit\" to abort operation", "ERROR! That is not a valid input!", 0, 100);
      if (!(result == -1)) {
          System.out.println("You have inputted: " + result);
      }
      System.out.println("Goodbye!");
  }
}
