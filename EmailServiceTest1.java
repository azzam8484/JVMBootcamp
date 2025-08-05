package org.example1;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
class EmailServiceTest {

    private EmailService emailService = new EmailService();

    @Test
    public void sendEmail_ShouldThrowExceptionAndMarkNotNotified() {
        Order order = new Order(1, "Pencil", 5.0);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            emailService.sendEmail(order);
        });

        assertEquals("An Exception Occurred", exception.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void sendEmail_WithCC_ShouldReturnTrueAndMarkNotified() {
        Order order = new Order(3, "Pen", 10.0);

        boolean result = emailService.sendEmail(order, "pqr@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }

    @Test
    public void sendEmail_ForZeroPriceOrder_ShouldHandleCorrectly() {
        Order order = new Order(3, "Free Sample", 0.0);

        boolean result = emailService.sendEmail(order, "lmo@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }
}