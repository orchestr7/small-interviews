/**
 * Will this code compile? What will be printed?
 * This task checks the knowledge of the implementation of interfaces.
 * In particular it tests your knowledge of how properties in interfaces work.
 */
public abstract interface TestInterface {
    public abstract void foo();
    public int a = 0;
}

class Test implements TestInterface {
    public void foo() {}
}

class Main {
    public static void main(String ... args) {
        // there is no constructor Test1() - how will it work?
        Test a = new Test();
        Test b = new Test();
	
       // we are trying to access public property from interface - will it work?
       System.out.println(a.a++);
       System.out.println(a.a++);
    }
}
