package com.Assignment.JPA2;
import jakarta.persistence.*;

@Entity
public class Bike extends Vehicle {
    private boolean hasCarrier;

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
