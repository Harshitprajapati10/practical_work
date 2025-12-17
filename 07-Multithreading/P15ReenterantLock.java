// Simple Synchronization Create a counter class with increment() method. Create multiple threads that increment the counter 1000 times each. Demonstrate the race condition
// without synchronization and fix it using synchronized keyword.
// ReentrantLock Rewrite the counter synchronization problem (Question 8) using ReentrantLock
// instead of synchronized . Demonstrate tryLock() with timeout.


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class P15ReenterantLock {
    static class Counter {
        private int count = 0;
        private final ReentrantLock lock = new ReentrantLock();

        public void increment() {
            try {
                if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
                    try {
                        count++;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Could not acquire lock, skipping increment");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        final Counter counter = new Counter();
        final int NUM_THREADS = 5;
        final int INCREMENTS_PER_THREAD = 1000;

        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Final count: " + counter.getCount());
    }
}