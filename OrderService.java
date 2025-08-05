package org.example1;

public class OrderService {
    private final EmailService emailService;

    // Constructor injection
    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder(Order order) {
        double priceWithTax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(priceWithTax);
        emailService.sendEmail(order);
        order.setCustomerNotified(true);
    }

    public boolean placeOrder(Order order, String cc) {
        double priceWithTax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(priceWithTax);
        boolean isNotified = emailService.sendEmail(order, cc);
        order.setCustomerNotified(isNotified);
        return isNotified;
    }
}