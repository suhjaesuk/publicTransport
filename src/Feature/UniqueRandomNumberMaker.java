package Feature;

import java.util.ArrayList;
import java.util.List;

public class UniqueRandomNumberMaker {
    private static final List<Integer> list = new ArrayList<Integer>();
    public static int makeUniqueRandomNumber() {
        int r;
        while (true) {
            boolean check = true;
            r = (int) (Math.random() * 100) + 1;
            if (list.contains(r)) check = false;
            if (check) {
                list.add(r);
                break;
            }
        }
        return r;
    }
}
