import java.util.concurrent.*;


class MyRunnable1 implements Runnable {
    public void run() {
        System.out.println("Runnable: Task is running");
    }
}

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1000); // Simulate some delay
        return "Callable: Task completed and result returned";
    }
}

public class D9J1 {
    public static void main(String[] args) throws Exception {
        // Runnable
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        // Callable
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallable());

        String result = future.get();
        System.out.println(result);

        executor.shutdown();
    }
}
