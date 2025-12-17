class Counter {
    int count = 0;

    // synchronized void increment() {
    //     count++; // NOT atomic
    // }
    void increment() {
        synchronized (this) {
            count++; // NOT atomic
        }
    }
}

public class class06synchro {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}


