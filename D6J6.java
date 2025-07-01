
enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REFUNDED
}

public class D6J6 {

    public String processOrderStatus(OrderStatus status) {
        return switch (status) {  
            case PENDING -> {
                int estimatedHours = 24;
                yield String.format("Order is being prepared. Estimated completion in %d hours.", estimatedHours);
            }
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> {
                int estimatedDays = 3;
                yield String.format("Order has been canceled. Estimated refund in %d days.", estimatedDays);
            }
            case REFUNDED -> "Refund has been issued for the order.";
        };
    }

    public static void main(String[] args) {
        D6J6 process = new D6J6();

        System.out.println(process.processOrderStatus(OrderStatus.PENDING));

        OrderStatus shippedStatus = OrderStatus.SHIPPED;
        System.out.println(process.processOrderStatus(shippedStatus));

        System.out.println(process.processOrderStatus(OrderStatus.CANCELLED));
    }
}