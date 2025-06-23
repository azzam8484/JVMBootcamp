public class NoStackTraceException extends RuntimeException
{
    public NoStackTraceException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        // Prevents the stack trace from being generated
        return null;
    }
}
