package lexicon.se;

// Make a simple calculation using the "Switch" case.

import java.util.Scanner;

public class calculatorApp {
    public static void main(String[] args) {

        // Declare variables
        int operator;
        double number1, number2;
        boolean continueCalculation = true;

        do {

            // Declare the selector menu for users to choose.
            System.out.println("1. Add: ");
            System.out.println("2. Subtract: ");
            System.out.println("3. Multiple: ");
            System.out.println("4. Divide: ");
            System.out.println("5. Exit:");
            System.out.println("Choose Operator: ");

            // Let the user to enter the operator and save their choice to the memory.
            Scanner scanner = new Scanner(System.in);
            operator = scanner.nextInt();

            // Check if the operator is valid before asking for numbers.

            if (operator == 5) {
                continueCalculation = false;
                System.out.println("Exiting the calculator. Goodbye!");
            } else if (operator > 5 || operator < 1) {
                System.out.println("Entered numbered in not valid.");
            } else {
                //Ask the user to enter the First number and store it to the" number1".
                System.out.println("Enter First Number: ");
                number1 = scanner.nextDouble();

                //Ask the user to enter the Second number and store it to the "number2".
                System.out.println("Enter Second Number: ");
                number2 = scanner.nextDouble();

                // Calculate the result with Switch method. We add variable "result" to store the calculation.
                double result = 0;
                switch (operator) {

                    case 1:
                        result = number1 + number2;
                        break;

                    case 2:
                        result = number1 - number2;
                        break;

                    case 3:
                        result = number1 * number2;
                        break;

                    case 4:
                        result = number1 / number2;
                        break;
                }
                System.out.println("Result is :" + result);
            }// if else

        }  // Do while
        while (continueCalculation);
    } // Main
}


