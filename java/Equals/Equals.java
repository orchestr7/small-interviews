import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This tasks checks the understanding of equals() method and == operator
 * What will be printed here?
 */
public class Equals {
    public static void main(String[] args) {
        // more examples:
        String [] a = {"a", "b"};
        String [] b = {"a", "b"};

        LinkedList<String> c = new LinkedList<>();
        ArrayList<String> d = new ArrayList<>();
        c.add("c");
        d.add("c");

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a == d);
    }
}
