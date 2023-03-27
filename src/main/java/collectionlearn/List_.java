package collectionlearn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaohu
 * @create 2023-03-25 19:55
 */
public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("july");
        list.add("july");
        System.out.println("list :" + list);
        System.out.println(list.get(2));

    }
}
