package java1;

public class D1J1 {

    static String Firstname;
    static String Lastname;
    static int age;


    static {
        Firstname = "Azzam";
        System.out.println("First Name  through (Static Block): " + Firstname);
    }


    static void printLastName() {
        Lastname = "Khan";
        System.out.println("Last Name (Static Method): " + Lastname);
    }

    public static void main(String[] args) {
        age = 22;
        System.out.println("Age (Static Variable): " + age);

        printLastName();
    }
}
