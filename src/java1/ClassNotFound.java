package java1;

public class ClassNotFound
{
    public static void main(String[] args) {
        try {
            Class.forName("azzamkhan");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e);
        }
    }
}
