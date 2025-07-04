class BankAccount {
    private final String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public synchronized void transfer(BankAccount toAccount, double amount) {
        System.out.println(Thread.currentThread().getName() +
                " transferring Rs. " + amount + " from " +
                this.name + " to " + toAccount.name);

        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    public String getName() {
        return name;
    }
}

public class D8J4 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Account-1", 1000);
        BankAccount account2 = new BankAccount("Account-2", 1000);

        Thread thread1 = new Thread(new TransferTask(account1, account2, 100), "Thread-1");
        Thread thread2 = new Thread(new TransferTask(account2, account1, 200), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class TransferTask implements Runnable {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public TransferTask(BankAccount from, BankAccount to, double amount) {
        this.fromAccount = from;
        this.toAccount = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        fromAccount.transfer(toAccount, amount);
    }
}