// Static Synchronization Create a class with both instance and static synchronized methods.
// Demonstrate that static synchronization locks the class level while instance synchronization
// locks object level.

public class P10staticSync {
    // Instance synchronized method
    public synchronized void instanceMethod() {
        System.out.println("Instance method executed.");
    }

    // Static synchronized method
    public static synchronized void staticMethod() {
        System.out.println("Static method executed.");
    }

    public static void main(String[] args) {
        P10staticSync obj1 = new P10staticSync();
        P10staticSync obj2 = new P10staticSync();

        // Thread for instance method on obj1
        Thread t1 = new Thread(() -> {
            obj1.instanceMethod();
        });

        // Thread for instance method on obj2
        Thread t2 = new Thread(() -> {
            obj2.instanceMethod();
        });

        // Thread for static method
        Thread t3 = new Thread(() -> {
            P10staticSync.staticMethod();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
