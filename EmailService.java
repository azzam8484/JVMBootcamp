package org.example1;

public class EmailService {
    public EmailService() {
        // No longer a singleton
    }

    public void sendEmail(Order order) {
        order.setCustomerNotified(false);
        throw new RuntimeException("An Exception Occurred");
    }

    public boolean sendEmail(Order order, String cc) {
        order.setCustomerNotified(true);
        return true;
    }
}