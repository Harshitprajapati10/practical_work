// wap with three methods methodA<B<C;  mehodc should through an arithmetic exception. let the exception propagate through mehodB to ethod A. where it should by caught and handled . demonstrate exception propagation in call stack.

public class Problem05{
    public static void methodA() {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in methodA: " + e.getMessage());
        }
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        int result = 10 / 0;
    }

    public static void main(String[] args) {
        methodA();
    }
}