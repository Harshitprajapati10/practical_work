// Question 2: Custom Exception Class
// Create a custom exception class InvalidAgeException that is thrown when an age value
// is less than 0 or greater than 150. Write a program that takes age as input and throws
// this custom exception with appropriate messages for invalid age values.
public class Q2CustomClass {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Invalid age. Age must be between 0 and 150.");
            }
            System.out.println("Valid age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}