//  CountDownLatch Use CountDownLatch to create a race starter program. Main thread
// should wait for 4 ”runners” (threads) to get ready, then signal all to start simultaneously.


public class P13downLatch {
    public static void main(String[] args) {
        final int NUM_RUNNERS = 4;
        java.util.concurrent.CountDownLatch readyLatch = new java.util.concurrent.CountDownLatch(NUM_RUNNERS);
        java.util.concurrent.CountDownLatch startLatch = new java.util.concurrent.CountDownLatch(1);

        class Runner implements Runnable {
            private final int id;

            Runner(int id) {
                this.id = id;
            }

            @Override
            public void run() {
                try {
                    System.out.println("Runner " + id + " is getting ready.");
                    Thread.sleep((long) (Math.random() * 2000)); // Simulate preparation time
                    System.out.println("Runner " + id + " is ready.");
                    readyLatch.countDown(); // Signal that this runner is ready
                    startLatch.await(); // Wait for the start signal
                    System.out.println("Runner " + id + " has started running!");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        // Create and start runner threads
        for (int i = 1; i <= NUM_RUNNERS; i++) {
            new Thread(new Runner(i)).start();
        }

        try {
            readyLatch.await(); // Wait for all runners to be ready
            System.out.println("All runners are ready. On your marks, get set, go!");
            startLatch.countDown(); // Signal all runners to start
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
