// Thread Sleep Write a program that creates a clock thread displaying time every second
// using Thread.sleep(1000) . The clock should run for 10 seconds then stop.

class ClockTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current time: " + java.time.LocalTime.now());
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Clock has stopped after 10 seconds.");
    }
}

public class P6ThreadSleep {
    public static void main(String[] args) {
        Thread clockThread = new Thread(new ClockTask(), "Clock-Thread");
        clockThread.start();
        try {
            clockThread.join(); // Wait for the clock thread to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
