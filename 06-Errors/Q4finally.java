// Question 4: Finally Block Demonstration
// Create a program that opens a file for reading using FileInputStream. Handle FileNotFoundExceptionand ensure that the file stream is properly closed in the finally block. Demonstrate
// that the finally block executes regardless of whether an exception occurs or not.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4finally {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("nonexistentfile.txt");
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: I/O Exception occurred.");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("\nFile stream closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error: Failed to close the file stream.");
                }
            } else {
                System.out.println("File stream was never opened.");
            }
        }
    }
}
