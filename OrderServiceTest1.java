package org.example1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderServiceTest1 {

    @Test
    public void testTaxValue() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Pen", 100.0);

        boolean result = orderService.placeOrder(order, "abc@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(120.0, order.getPriceWithTax(), 0.001);
    }

    @Test
    public void testNoCC() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Bag", 500.0);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            orderService.placeOrder(order);
        });

        assertEquals("An Exception Occurred", exception.getMessage());
        assertFalse(order.isCustomerNotified());
        assertEquals(600.0, order.getPriceWithTax(), 0.001);
    }

    @Test
    public void testZeroPriceOrder() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(3, "Gift", 0.0);

        boolean result = orderService.placeOrder(order, "xyz@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(0.0, order.getPriceWithTax(), 0.001);
    }
}
