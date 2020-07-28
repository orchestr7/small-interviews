import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.minBy;

/**
 * Will this program compile? If yes - what will be printed?
 * How you would change this code as developer?
 */
class WorkWithArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("third");
        list.add("second");
        list.add("first");

        var list1 = list.stream()
                .map(line -> line + " element ")
                .distinct()
                .sorted()
                .reduce("", (str, element) -> str + element);

        var list2 = list.stream()
                .collect(minBy(Comparator.naturalOrder()))
                .orElse("second") + " element ";

        System.out.println(list1 + list2);
    }
}
