public class D8J3 {
    // volatile
    private static boolean nonVol = true;

    // volatile
    private static volatile boolean vol = true;

    public static void main(String[] args) throws InterruptedException {

        Thread nonVolThread = new Thread(() -> {
            System.out.println("Non-volatile thread started");
            while (nonVol) {

            }
            System.out.println("Non-volatile thread stopped");
        });


        Thread volThread = new Thread(() -> {
            System.out.println("Volatile thread started");
            while (vol) {

            }
            System.out.println("Volatile thread stopped");
        });

        nonVolThread.start();
        volThread.start();

        Thread.sleep(1000);

        System.out.println("Main thread changing flags...");
        nonVol = false;
        vol = false;


        nonVolThread.join(2000); // Timeout in case it doesn't stop
        volThread.join();

        System.out.println("\nThread status:");
        System.out.println("Non-volatile thread alive: " + nonVolThread.isAlive());
        System.out.println("Volatile thread alive: " + volThread.isAlive());
    }
}