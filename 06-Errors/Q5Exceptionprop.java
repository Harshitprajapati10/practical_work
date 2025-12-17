// Question 5: Exception Propagation
// Write a program with three methods: methodA(), methodB(), and methodC(). methodC()
// should throw an ArithmeticException. Let the exception propagate through methodB()
// to methodA(), where it should be caught and handled. Demonstrate exception propagation in the call stack



public class Q5Exceptionprop {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Caught in methodA: " + e.getMessage());
        }
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        methodC();
    }

    static void methodC() {
        // This will throw ArithmeticException
        int result = 10 / 0;
    }
}