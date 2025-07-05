import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount2 {
    private final String name;
    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount2(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    public void transfer(BankAccount2 toAccount, double amount) {
        Lock firstLock = this.name.compareTo(toAccount.name) < 0 ? this.lock : toAccount.lock;
        Lock secondLock = this.name.compareTo(toAccount.name) < 0 ? toAccount.lock : this.lock;

        firstLock.lock();
        try {
            secondLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() +
                        " transferring Rs. " + amount + " from " +
                        this.name + " to " + toAccount.name);

                this.withdraw(amount);
                toAccount.deposit(amount);
            } finally {
                secondLock.unlock();
            }
        } finally {
            firstLock.unlock();
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}

public class D9J2 {
    public static void main(String[] args) {
        BankAccount2 account1 = new BankAccount2("Account-1", 1000);
        BankAccount2 account2 = new BankAccount2("Account-2", 1000);

        Thread thread1 = new Thread(new TransferTask2(account1, account2, 100), "Thread-1");
        Thread thread2 = new Thread(new TransferTask2(account2, account1, 200), "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance of " + account1.getName() + ": " + account1.getBalance());
        System.out.println("Final balance of " + account2.getName() + ": " + account2.getBalance());
    }
}

class TransferTask2 implements Runnable {
    private BankAccount2 fromAccount;
    private BankAccount2 toAccount;
    private double amount;

    public TransferTask2(BankAccount2 from, BankAccount2 to, double amount) {
        this.fromAccount = from;
        this.toAccount = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        fromAccount.transfer(toAccount, amount);
    }
}