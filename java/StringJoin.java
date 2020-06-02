import java.util.Arrays;
import java.util.List;

class StringJoin {
    public static void main(String[] args) {
        // Is there some other ways to initialize this list?
        // Which list is returned here?
        List<String> listWithStrings = Arrays.asList("first", "second", "third");
        System.out.println(joinStringWithComma(listWithStrings));
    }

    /**
     * This method should join strings. What issues do you see here?
     */
    static String joinStringWithComma(List<String> listOfStrings) {
        String result = "";
        for (int i = 0; i < listOfStrings.size(); ++i) {
            // Can I use [] on listOfString here?
            result += (listOfStrings.get(i) + ',');
        }

        return result;
    }
}