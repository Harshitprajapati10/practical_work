//  Semaphore Implement a simple connection pool using Semaphore . Create a pool of 3
// connections. 5 threads should compete for connections, acquiring and releasing them

public class P14Semaphores {
    public static void main(String[] args) {
        final int POOL_SIZE = 3;
        final int NUM_THREADS = 5;
        java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(POOL_SIZE);

        class Connection {
            private final int id;

            Connection(int id) {
                this.id = id;
            }

            public void use() {
                System.out.println("Using connection " + id);
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        class ConnectionPool {
            private final java.util.concurrent.Semaphore semaphore;
            private final Connection[] connections;

            ConnectionPool(int size) {
                this.semaphore = new java.util.concurrent.Semaphore(size);
                this.connections = new Connection[size];
                for (int i = 0; i < size; i++) {
                    connections[i] = new Connection(i);
                }
            }

            public void acquireConnection() throws InterruptedException {
                semaphore.acquire();
                System.out.println("Acquired a connection.");
            }

            public void releaseConnection() {
                semaphore.release();
                System.out.println("Released a connection.");
            }
        }

        ConnectionPool pool = new ConnectionPool(POOL_SIZE);

        class Worker implements Runnable {
            @Override
            public void run() {
                try {
                    pool.acquireConnection();
                    for (int i = 0; i < 3; i++) { // Each worker uses the connection multiple times
                        pool.connections[0].use(); // Use the first connection (simplified)
                    }
                    pool.releaseConnection();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            new Thread(new Worker()).start();
        }
    }
}