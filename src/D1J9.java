public class D1J9
{
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This is a custom exception without stack trace.");
        } catch (NoStackTraceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
