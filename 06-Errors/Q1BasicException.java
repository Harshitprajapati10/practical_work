// package 06-Errors;


// Question 1: Basic Exception Handling
// Write a Java program that reads two integers from the user and performs division. Handle ArithmeticException when dividing by zero and InputMismatchException when
// invalid input is provided. Display appropriate error messages for each scenario

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1BasicException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");

        } finally {
            sc.close();
        }
    }
}
