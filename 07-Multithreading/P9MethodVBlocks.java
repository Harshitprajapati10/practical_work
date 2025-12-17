// 9: Synchronized Method vs Block Create a shared printer class. Implement two versions:
// • Using synchronized method
// • Using synchronized block
// Compare the granularity of locking in both approaches.

class SharedPrinter {
    // Synchronized method
    public synchronized void printWithMethod(String message) {
        System.out.println(message);
        try {
            Thread.sleep(200); // Simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Synchronized block
    public void printWithBlock(String message) {
        synchronized (this) {
            System.out.println(message);
            try {
                Thread.sleep(200); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class P9MethodVBlocks {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                printer.printWithMethod("Thread 1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                printer.printWithBlock("Thread 2: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}