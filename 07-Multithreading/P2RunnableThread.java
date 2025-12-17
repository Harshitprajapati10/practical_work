// Question 2: Thread vs Runnable Implement the same counting program (1 to 10) using both:
// • Extending Thread class
// • Implementing Runnable interface
// Compare both approaches


class OddNumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); // Sleep to simulate work and allow interleaving
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class EvenNumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // Sleep to simulate work and allow interleaving
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class P2RunnableThread {
    public static void main(String[] args) {
        OddNumberPrinter oddThread = new OddNumberPrinter();
        EvenNumberPrinter evenThread = new EvenNumberPrinter();

        oddThread.start();
        evenThread.start();
    }
}