package calculator;

import calculator.operation.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            double x = in.nextDouble();
            in.nextLine();
            System.out.println("Enter arithmetic operator (‘+’, ‘-’, ‘*’ or ‘/’): ");
            String sim = in.nextLine();
            System.out.println("Enter the second number: ");
            double y = in.nextDouble();
            double result = 0;
            switch (sim) {
                case "+":
                    Operation addition = new Addition();
                    result = addition.returnResult(x, y);
                    break;
                case "-":

                    Operation subtraction = new Subtraction();
                    result = subtraction.returnResult(x, y);
                    break;
                case "*":
                    Operation multiplication = new Multiplication();
                    result = multiplication.returnResult(x, y);
                    break;
                case "/":
                    try {
                        Operation division = new Division();
                        result = division.returnResult(x, y);
                        break;
                    }catch(ArithmeticException e) {
                        System.out.println("Divide by zero! Exception thrown :" + e);
                    }
                default:
                    System.out.println("ERROR");
                    return;
            }
            if(result - Math.floor(result) > 0) {
                System.out.println("Result: " + result);
            }
            else{
                int resultInt = (int) result;
                System.out.println("Result: " + resultInt);
            }
        }catch(InputMismatchException e) {
        System.out.println("Invalid character! Exception thrown :" + e);
        }
    }
}
