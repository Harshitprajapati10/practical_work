// Question 7: Throw and Throws
// Create a method validatePassword() that takes a password string and throws a custom
// WeakPasswordException if the password length is less than 8 characters. Use the throw
// keyword to throw the exception and declare it in the method signature using throws.
// Write a main method to test this functionality.

public class Q7throwvthrows {
    static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password is too weak. It must be at least 8 characters long.");
        }
    }

    public static void main(String[] args) {
        try {
            validatePassword("12345");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}