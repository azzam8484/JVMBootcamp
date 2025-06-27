interface A {
    default void show() {
        System.out.println("Default method: interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Default method: interface B");
    }
}

class C implements A, B {

    @Override
    public void show() {

        A.super.show();
        B.super.show();
        System.out.println("Overridden method: class C");
    }
}

public class D4J3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
