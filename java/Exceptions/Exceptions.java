package exceptions;

/**
 * Will this class compile? If not - why it will not compile. If yes - what is the output?
 */
public class Exceptions {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            foo();
        } finally {
            System.out.print("c");
        }
        System.out.print("d");
    }

    private static void foo() {}
}
