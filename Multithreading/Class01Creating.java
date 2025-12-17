// package Multithreading;

public class Class01Creating {
    public static void main(String[] args) {
        // Creating a thread by extending the Thread class
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        }

        MyThread thread = new MyThread();
        thread.start(); // Start the thread

        class MyThread2 implements Runnable {
            @Override
            public void run() {
                System.out.println("Runnable thread is running");
            }
        }

        class MyThread3 implements Runnable {
            @Override
            public void run() {
                System.out.println("Runnable thread is running");
            }
        }
        MyThread3 runnable = new MyThread3();
        Thread thread2 = new Thread(runnable);
        thread2.start(); // Start the thread
    }
}
