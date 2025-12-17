public class class09statedemo {
    static final Object lock = new Object();

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000); // TIMED_WAITING
            } catch (InterruptedException e) {
            }
        });

        // 1. NEW
        System.out.println("State after creation: " + t.getState());

        t.start();

        // Small delay to let thread start
        Thread.sleep(100);

        // 2. RUNNABLE or TIMED_WAITING
        System.out.println("State after start: " + t.getState());

        // Wait until thread finishes
        t.join();

        // 3. TERMINATED
        System.out.println("State after completion: " + t.getState());

        // WAITING state demo
        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // WAITING
                } catch (InterruptedException e) {
                }
            }
        });
        t4.start();
        Thread.sleep(100);
        System.out.println("Thread state: " + t4.getState());

        // blocked state demo
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Acquired lock");
            }
        });

        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);

        System.out.println("Thread t2 state: " + t2.getState());

        
        // timed wating state demo
        Thread t5 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        });

        t5.start();
        Thread.sleep(100);
        System.out.println(t5.getState());
    }
}
