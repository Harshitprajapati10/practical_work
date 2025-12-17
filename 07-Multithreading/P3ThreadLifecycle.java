
public class P3ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try{
                Thread.sleep(500); // Simulate work
            }catch(InterruptedException e){
                Thread.currentThread().interrupt(); 
            }
        });

        System.out.println("State after creation: " + thread.getState()); // NEW
        thread.start();
        System.out.println("State after start: " + thread.getState()); // RUNNABLE
        
        
        try {
            thread.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("State after completion: " + thread.getState()); // TERMINATED


        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000); // TIMED_WAITING
            } catch (Exception e) {
            }
        });
        t2.start();
        Thread.sleep(100);
        System.out.println("State after sleep: " + t2.getState()); // TERMINATED or TIMED_WAITING depending on timing
    }
}
