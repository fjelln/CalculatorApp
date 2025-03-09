package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber;
        String operator;

        double secondNumber;
        double result = 0;
        boolean dividedByZero = false;
        String runAgain;

        System.out.println("Hello and welcome!");
        while(true) {
            System.out.print("Write a number: ");
            firstNumber = input.nextDouble();
            while(true) {
                System.out.print("Choose an operator (+, -, *, /): ");
                operator = input.next();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    break;
                } else {
                    System.out.println("Try again!");
                }
            }
            System.out.print("Write a number: ");
            secondNumber = input.nextDouble();

            switch(operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0.0) {
                        System.out.println("Can't divide by zero!");
                        dividedByZero = true;
                    }
                    result = firstNumber / secondNumber;
                    break;
            }
            if (!dividedByZero) {
                System.out.println(result);
            }
            System.out.print("Again? (y/n): ");
            runAgain = input.next();
            if (runAgain.equals("n")) {
                System.out.print("Bye!");
                break;
            }
        }
    }
}