import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Initializer {
    List<Integer> array;

    Initializer(int n) {
        // take random N integers in the range [0; n) with no duplications.
        List<Integer> array = initStraightArray(n);
        Collections.shuffle(array);

        // remove one random integer
        int randomIndex = new Random().ints(0, n).findFirst().getAsInt();
        array.remove(randomIndex);
        this.array = array;
    }

    public List<Integer> getArray() {
        return array;
    }

    private List<Integer> initStraightArray(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            result.add(i);
        }
        return result;
    }
}