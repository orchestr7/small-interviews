public class A {
    public A() {
        System.out.print("A default ");
    }

    public A(int value) {
        System.out.print("A constructor ");
    }

    private boolean isFoo() {
        return false;
    }

    public static void main(String[] args) {
        A a = new B(5);
        System.out.print(", " + a.isFoo());
    }
}

public class B extends A {
    public B(int value) {
        System.out.print("B constructor ");
    }
    public boolean isFoo() {
        return true;
    }
}
