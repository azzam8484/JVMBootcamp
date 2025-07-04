class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void incrementByMethod() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count (method): " + count);
    }

    // synchronized block
    public void incrementByBlock() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count (block): " + count);
        }
    }
}

class MyThread1 extends Thread {
    Counter counter;
    boolean useMethod;

    MyThread1(Counter counter, boolean useMethod, String name) {
        super(name);
        this.counter = counter;
        this.useMethod = useMethod;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            if (useMethod)
                counter.incrementByMethod();
            else
                counter.incrementByBlock();
        }
    }
}

public class D8J2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread1 t1 = new MyThread1(counter, true, "Thread-1");
        MyThread1 t2 = new MyThread1(counter, false, "Thread-2");

        t1.start();
        t2.start();
    }
}
