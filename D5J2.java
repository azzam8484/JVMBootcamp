interface Vehicle {

    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped (default method)");
    }

    // Static method
    static void honk() {
        System.out.println("Honking! (static method)");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class D5J2 {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();

        c.stop();

        //static method call
        Vehicle.honk();
    }
}
