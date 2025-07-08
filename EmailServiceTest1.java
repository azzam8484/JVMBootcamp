package org.example1;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailServiceTest1 {

    @Test
    public void testEmailException() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Pencil", 5.0);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            emailService.sendEmail(order);
        });

        assertEquals("An Exception Occurred", exception.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void testEmailWithCC() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(3, "Pen", 10.0);

        boolean result = emailService.sendEmail(order, "pqr@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }

    @Test
    public void testZeroPriceOrder() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(3, "Free Sample", 0.0);

        boolean result = emailService.sendEmail(order, "lmo@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(0.0, order.getPrice(), 0.001);
    }
}
