package java1;


public class D1J9
{
    public static void main(String[] args) throws NoStackTraceException {
        try {
            throw new Throwable("This is a custom exception without stack trace.");
        } catch (Throwable e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
