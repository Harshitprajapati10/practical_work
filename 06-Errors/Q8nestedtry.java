// Question 8: Nested Try-Catch
// Write a program with nested try-catch blocks. The outer block should handle NumberFormatException
// and the inner block should handle ArithmeticException. Demonstrate how exceptions
// are handled in nested scenarios and show the flow of execution.



public class Q8nestedtry {
    public static void main(String[] args) {
        String[] numbers = {"10", "0", "abc", "5"};

        for (String numStr : numbers) {
            try {
                int num = Integer.parseInt(numStr);
                try {
                    int result = 100 / num;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException: Cannot divide by zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Invalid number format for input '" + numStr + "'.");
            }
        }
    }
}