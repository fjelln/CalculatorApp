package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber;
        String operator;
        double secondNumber;
        double result = 0;

        System.out.println("Hello and welcome!");
        System.out.print("Write a number: ");
        firstNumber = input.nextDouble();
        System.out.print("Choose an operator (+, -, *, /): ");
        operator = input.next();
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
                result = firstNumber / secondNumber;
            default:
                System.out.println("Invalid operator: " + operator);
        }
        System.out.println(result);
    }
}