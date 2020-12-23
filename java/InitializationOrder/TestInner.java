/**
 * This tricky task checks the understanding of the order of calls during of the initialization of a class.
 * Pay attention to static blocks! What will be printed?
 */
public class TestInner {
    int dangerousVariable;

    static { System.out.println("Inner static block 1"); }
    static { new TestInner(); }

    TestInner() { System.out.println("Constr"); }

    static { System.out.println("Inner static block 2"); }

    { System.out.println("Inner initialization block with a variable:" + dangerousVariable); }
    { dangerousVariable = 7; }
}

class TestOuter {
    public static void main(String[] args) {
        new TestInner();
        System.out.println(new TestInner().dangerousVariable);
    }
}

