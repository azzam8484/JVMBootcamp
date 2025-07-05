import java.util.*;
import java.util.concurrent.*;

public class D9J3 {
    static class MyTask implements Callable<String> {
        private final int taskId;
        public MyTask(int id) {
            this.taskId = id;
        }
        public String call() throws Exception {
            Thread.sleep(1000);
            return "Task " + taskId + " completed by " + Thread.currentThread().getName();
        }
    }

    public static void executeTasks(String executorType, ExecutorService executor, List<Callable<String>> tasks) throws InterruptedException {
        System.out.println("\nUsing " + executorType );
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> future : results) {
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> taskList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            taskList.add(new MyTask(i));
        }

        // SingleThreadExecutor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        executeTasks("SingleThreadExecutor", singleThreadExecutor, taskList);

        // FixedThreadPool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        executeTasks("FixedThreadPool (3 threads)", fixedThreadPool, taskList);

        // CachedThreadPool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        executeTasks("CachedThreadPool", cachedThreadPool, taskList);
    }
}
