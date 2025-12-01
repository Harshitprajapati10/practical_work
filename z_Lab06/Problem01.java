
// waf that  reads two integers from the user and perfrom division. handle arithmetic exception when dividing by zero  and input Mismatch exception when user enters non integer values. display proper error messages for both exceptions.`


import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: "); int n1 = sc.nextInt();
        System.out.print("Enter second number: "); int n2 = sc.nextInt();
        try {
            int result = n1 / n2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integer values.");
        } finally {
            sc.close(); 
        }
    }
}