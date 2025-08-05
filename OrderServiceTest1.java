package org.example1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest1 {  // Changed to public class

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Test
    public void placeOrder_WithCC_ShouldSendEmailAndReturnTrue() {
        Order order = new Order(3, "Pen", 10.0);
        when(emailService.sendEmail(order, "pqr@gmail.com")).thenReturn(true);

        boolean result = orderService.placeOrder(order, "pqr@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(12.0, order.getPriceWithTax(), 0.001);
        verify(emailService, times(1)).sendEmail(order, "pqr@gmail.com");
    }

    @Test
    public void placeOrder_WithoutCC_ShouldThrowException() {
        Order order = new Order(1, "Bag", 500.0);
        doThrow(new RuntimeException("An Exception Occurred"))
                .when(emailService).sendEmail(order);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            orderService.placeOrder(order);
        });

        assertEquals("An Exception Occurred", exception.getMessage());
        assertFalse(order.isCustomerNotified());
        assertEquals(600.0, order.getPriceWithTax(), 0.001);
        verify(emailService, times(1)).sendEmail(order);
    }

    @Test
    public void placeOrder_WithZeroPrice_ShouldHandleCorrectly() {
        Order order = new Order(3, "Gift", 0.0);
        when(emailService.sendEmail(order, "xyz@gmail.com")).thenReturn(true);

        boolean result = orderService.placeOrder(order, "xyz@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(0.0, order.getPriceWithTax(), 0.001);
        verify(emailService, times(1)).sendEmail(order, "xyz@gmail.com");
    }
}