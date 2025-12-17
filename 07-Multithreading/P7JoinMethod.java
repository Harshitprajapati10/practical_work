// Join Method Create three threads where:
// • Thread1 counts 1-5
// • Thread2 starts only after Thread1 completes
// • Thread3 starts only after Thread2 completes
// Use join() method to coordinate them

public class P7JoinMethod {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                thread1.join(); // Wait for thread1 to finish
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                thread2.join(); // Wait for thread2 to finish
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 3: " + i);
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
