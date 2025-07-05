import java.util.concurrent.*;
public class D9J5 {

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is starting task");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " finished task");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        };

        //Using shutdown
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        System.out.println("Using shutdown():");
        executor1.submit(task);
        executor1.shutdown();
        executor1.awaitTermination(3, TimeUnit.SECONDS);

        //Using shutdownNow
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        System.out.println("\nUsing shutdownNow():");
        executor2.submit(task);
        executor2.shutdownNow();
    }
}
