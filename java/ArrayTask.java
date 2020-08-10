import java.util.List;

/**
 * very ugly code. How you would improve it?
 */
class ArrayTask {
    public static int NUMBER_OF_INTEGERS = 100;

    public static void main(String[] args) {
        List<Integer> initialArray = new Initializer(NUMBER_OF_INTEGERS).getArray();
        System.out.println(findMyLovelyMissingNumber(initialArray, NUMBER_OF_INTEGERS));
    }

    /**
     *
     * @param initialArray - array of integer numbers with size N-1 (NUMBER_OF_INTEGERS - 1).
     *                   This array contains random N-1 integer numbers in the range [0; N) with no duplications.
     * @param NUMBER_OF_INTEGERS - magic number N that is used to construct the array
     * @return this method should return integer number in range [0; N) that is missing in this array.
     */
    private static int findMyLovelyMissingNumber(List<Integer> initialArray, int NUMBER_OF_INTEGERS) {
        // TODO: implement
    }
}