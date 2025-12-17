//  Thread Naming and Priority Create three threads with different priorities (MIN, NORM,
// MAX) and names. Each thread should print its name and priority, then count to 5. Observe
// the execution order

class CountingTask implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        int threadPriority = Thread.currentThread().getPriority();
        System.out.println(threadName + " with priority " + threadPriority + " is starting.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " count: " + i);
            try {
                Thread.sleep(100); // Sleep to simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(threadName + " has finished counting.");
    }
}

public class P4Naming {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CountingTask(), "Thread-MIN");
        thread1.setPriority(Thread.MIN_PRIORITY);

        Thread thread2 = new Thread(new CountingTask(), "Thread-NORM");
        thread2.setPriority(Thread.NORM_PRIORITY);

        Thread thread3 = new Thread(new CountingTask(), "Thread-MAX");
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}