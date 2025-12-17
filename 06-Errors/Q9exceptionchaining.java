// Question 9: Exception Chaining
// Create a program that demonstrates exception chaining. Catch a FileNotFoundException,
// then throw a custom DataProcessingException with the original exception as the cause.
// Show how to retrieve the chained exception using getCause() metho
import java.io.*;
public class Q9exceptionchaining {
    static class DataProcessingException extends Exception {
        public DataProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    static void readFile(String fileName) throws DataProcessingException {
        try {
            FileInputStream fis = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new DataProcessingException("Failed to process data due to file not found.", e);
        }
    }
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (DataProcessingException e) {
            System.out.println("DataProcessingException caught: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}
