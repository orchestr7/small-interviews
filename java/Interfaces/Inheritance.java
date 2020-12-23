/**
 *
 * Child class implements two interfaces. Both of them have methods with the default implementation (Java8).
 * Main question here is the compilation of such code. There are two main things that this code tests:
 * 1. Knowledge of interfaces and default method implementation
 * 2. Knowledge of how type casting works
 *
 */
interface Foo { default int foo() {return 1;} }
interface Bar { default int foo() {return 2;} }
class Child implements Foo, Bar {
    // Will this compile? Both interfaces have this method with implementation.
    public int foo() { return 0; }
    public static void main(String[] args) {
        // Creating a Child instance, but assigning to Object
        Object childObject = new Child();
        // Casting it to the interface Foo
        Foo f = (Foo) childObject;
        // It looks like we are casting one independent interface to another
        Bar b = (Bar) f;
        // What will be printed? Which method is called?
        System.out.println(b.foo());
        System.out.println(f.foo());
    }
}