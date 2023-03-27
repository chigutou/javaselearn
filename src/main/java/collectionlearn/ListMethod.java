package collectionlearn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaohu
 * @create 2023-03-25 20:00
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new ArrayList();
        list2.add("2-javck");
        list2.add("2-tom");
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("july");
        list.add("july");
        System.out.println("list1"+list);
        list.add(2,"lixiaohu");
        System.out.println("list2"+list);
        list.addAll(3,list2);
        System.out.println("list3"+list);
        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("july"));
        list.remove(0);
        System.out.println("list4"+list);
        list.set(4,"lllla");
        System.out.println("list5"+list);
        System.out.println(list.subList(2,4));//返回的子集合[2,4)左闭右开





    }
}
