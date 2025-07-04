class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Runnable thread interrupted.");
        }
        System.out.println("Runnable thread finished: " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread class thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread class thread interrupted.");
        }
        System.out.println("Thread class thread finished: " + Thread.currentThread().getName());
    }
}

public class D8J1 {
    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        MyRunnable mr=new MyRunnable();
        Thread t1 = new Thread(mr, "RunnableThread");

        MyThread t2 = new MyThread();
        t2.setName("ThreadClassThread");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished: " + Thread.currentThread().getName());
    }
}
