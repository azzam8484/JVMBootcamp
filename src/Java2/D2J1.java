package Java2;
import java.util.Scanner;
enum HouseType {
    VILLA(5000000),
    APARTMENT(2500000),
    DUPLEX(4000000);

    private final int price;
    HouseType(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name() + " costs ₹" + price;
    }
}
public class D2J1 {
    public static void main(String[] args) {
        System.out.println("House Types and Their Prices:");
        for (HouseType house : HouseType.values()) {
            System.out.println(house);
        }
    }
}
