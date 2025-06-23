package java1;

public class D1J5 {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public D1J5() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.designation = "N";
    }


    public D1J5(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public D1J5(D1J5 other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.designation = other.designation;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "Employee Details:\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation;
    }

    public static void main(String[] args) {

        D1J5 emp1 = new D1J5("Azzam", "Khan", 22, "Software Engineer");
        System.out.println(emp1);

        D1J5 emp2 = new D1J5();
        emp2.setFirstName("Satwik");
        emp2.setLastName("Sharma");
        emp2.setAge(26);
        emp2.setDesignation("IAS");
        System.out.println("\n" + emp2);

        D1J5 emp3 = new D1J5(emp1);
        emp3.setDesignation("Senior Developer");
        System.out.println("\n" + emp3);
    }
}
