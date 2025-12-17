// Question 6: Try-with-Resources
// Implement a program that uses try-with-resources to automatically manage a FileInputStream
// and FileOutputStream. The program should copy content from one file to another. Handle IOException and demonstrate that resources are automatically closed
import java.io.*;
public class Q6trywithResc {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}