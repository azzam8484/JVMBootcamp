package java1;

// Custom exception with no stack trace
public class NoStackTraceException extends RuntimeException {
    public NoStackTraceException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;  // or return null; to completely avoid trace
    }
}
