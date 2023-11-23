package collectionlearn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaohu
 * @create 2023-11-22 13:52
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add("lheel" + i);
        }
        System.out.println(list);
        list.add(2,"lixioahu");
        System.out.println(list);
        System.out.println(list.get(5));

    }
}
