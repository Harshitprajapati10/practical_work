// Question 3: Multiple Catch Blocks
// Write a program that creates an array of 5 integers and asks the user for an index to display. Handle ArrayIndexOutOfBoundsException for invalid indices and InputMismatchException
// for non-integer input using multiple catch blocks.
import java.util.InputMismatchException;
public class Q3mutiplecatches {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter index to display: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}