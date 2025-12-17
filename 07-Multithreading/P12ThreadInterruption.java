// Thread Interruption Create a thread that counts infinitely until interrupted. Main thread
// should interrupt it after 3 seconds. Handle the interruption gracefully.

class CountingTask implements Runnable {
    @Override
    public void run() {
        int count = 0;
        try {
            while (true) {
                System.out.println("Count: " + count++);
                Thread.sleep(500); // Sleep for half a second
            }
        } catch (InterruptedException e) {
            System.out.println("Counting thread interrupted. Exiting...");
        }
    }
}

public class P12ThreadInterruption {
    public static void main(String[] args) {
        Thread countingThread = new Thread(new CountingTask());
        countingThread.start();

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countingThread.interrupt(); // Interrupt the counting thread
    }
}