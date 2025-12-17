// Daemon Threads Create a user thread that counts to 20 and a daemon thread that counts
// to 100. Demonstrate that the JVM exits when all user threads finish, even if daemon threads
// are still running

class CountingTask implements Runnable {
    private final int maxCount;

    public CountingTask(int maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 1; i <= maxCount; i++) {
            System.out.println(threadName + " count: " + i);
            try {
                Thread.sleep(50); // Sleep to simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(threadName + " has finished counting.");
    }
}



public class P5daemon {
    public static void main(String[] args) {
        Thread userThread = new Thread(new CountingTask(20), "User-Thread");
        Thread daemonThread = new Thread(new CountingTask(100), "Daemon-Thread");
        daemonThread.setDaemon(true); // Set as daemon thread

        userThread.start();
        daemonThread.start();
    }
}
