package Java2;

class PrinterSpooler {
    private static PrinterSpooler instance;

    private PrinterSpooler() {
        System.out.println("Printer Spooler initialized.");
    }

    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    public void printDocument(String docName) {
        System.out.println("Printing document: " + docName);
    }
}

public class D2J5{
    public static void main(String[] args) {
        PrinterSpooler spooler1 = PrinterSpooler.getInstance();
        spooler1.printDocument("Resume.pdf");

        PrinterSpooler spooler2 = PrinterSpooler.getInstance();
        spooler2.printDocument("Invoice.pdf");

        System.out.println("Is same spooler? " + (spooler1 == spooler2));
    }
}
