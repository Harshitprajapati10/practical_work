// waf that opens a file using FileInputStream . Handle fileNotFoundException and ensure that the file stream is properly closed in the finally block. demonstrate that the finally block excecutes regardless of whether an exception occurs or not.


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Problem04{
    public static void main(String[] args){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("example.txt");
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("\nFile stream closed.");
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }

        System.out.println("okay");
    }
}