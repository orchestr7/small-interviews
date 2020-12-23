/**
 * This task checks your understanding of interface implementation and method overriding in Java8+
 * Class extends a super class and implements an interface that both have the same method foo()
 * What will be printed here? #interface #inheritance
 */
interface A {
    default void foo() { System.out.println("A"); } // what is the default modifier used for?
}

class C {
    public void foo() { System.out.println("C"); }
}

class B extends C implements A  {
    public void foo() { System.out.println("B"); }

    public static void main(String[] args) {
        C c = new B();
        c.foo();
        A a = new B();
        a.foo();
    }
}
