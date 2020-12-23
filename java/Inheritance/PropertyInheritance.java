/**
 * Very simple question to test the basic understanding of Java inheritance.
 * What will be printed here? #inheritance
 */
class Parent {
    int a = 0;
    void foo() {
        System.out.println(a);
    }
}

class Child extends Parent {
    int a = 1;
    public static void main(String[] args) { new Child().foo(); }
}