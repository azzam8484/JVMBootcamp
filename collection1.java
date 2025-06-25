import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();

        floatList.add(10.5f);
        floatList.add(20.3f);
        floatList.add(5.2f);
        floatList.add(7.8f);
        floatList.add(15.6f);
        Iterator<Float> iterator = floatList.iterator();
        float sum = 0;

        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Sum of floating point numbers: " + sum);
    }
}
