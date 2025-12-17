// Simple Synchronization Create a counter class with increment() method. Create multiple threads that increment the counter 1000 times each. Demonstrate the race condition
// without synchronization and fix it using synchronized keyword

class Counter {
    private int count = 0;

    // Synchronized increment method to prevent race conditions
    public synchronized void increment() {
        count++;
    }   
    public int getValue() {
        return count;
    }
}


class CounterIncrementer implements Runnable {
    private final Counter counter;
    private final int increments;

    public CounterIncrementer(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
    }
}

public class P8synchornization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads that increment the counter
        Thread thread1 = new Thread(new CounterIncrementer(counter, 1000));
        Thread thread2 = new Thread(new CounterIncrementer(counter, 1000));
        Thread thread3 = new Thread(new CounterIncrementer(counter, 1000));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Counter Value: " + counter.getValue());
    }
}