// package Multithreading(lab7);

// Thread Creation Create two threads that print numbers from 1 to 10 simultaneously. One
// thread should print odd numbers and the other even numbers. Observe the interleaving of
// outputs

public class P1ThreadCreating {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Sleep to simulate work and allow interleaving
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100); // Sleep to simulate work and allow interleaving
                } catch (InterruptedException e1) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        t1.start();
        t2.start();
    }
}



/*
// Optional: Synchronized version to ensure strict alternation between odd and even prints
class NumberPrinter {
    private boolean isOddTurn = true;

    synchronized void printOdd(int num) {
        while (!isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Odd: " + num);
        isOddTurn = false;
        notify();
    }

    synchronized void printEven(int num) {
        while (isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Even: " + num);
        isOddTurn = true;
        notify();
    }
}
 */