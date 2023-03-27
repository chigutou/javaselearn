package collectionlearn;


import java.util.ArrayList;

/**
 * @author lixiaohu
 * @create 2023-03-25 18:04
 */
public class Collection_ {
    public static void main(String[] args) {
//        Map
        ArrayList<Object> arrList = new ArrayList<>();
        arrList.add("lixiaohu");
        arrList.add("jack");
        arrList.add("amy");
        arrList.add("tom");
        arrList.add(23);//有个自动装箱的过程，包装成Integer
        arrList.add(new Demo1());
        System.out.println("add=======:" + arrList);
        //remove删除元素或角标对应元素
        boolean lixiaohu = arrList.remove("lixiaohu");
        Object remove = arrList.remove(2);
        System.out.println(arrList.contains("tom"));
        System.out.println(arrList.contains("tom1"));
        System.out.println(arrList.size());
        System.out.println(arrList.isEmpty());
        ArrayList<Object> arrList2 = new ArrayList<>();
        arrList2.add("hongloumeng");
        arrList2.add("xiyouji");
        arrList.addAll(arrList2);
        System.out.println(arrList.containsAll(arrList2));

        System.out.println("result=======:" + arrList);
        arrList.removeAll(arrList2);
        System.out.println(arrList.containsAll(arrList2));
        arrList.clear();
        System.out.println("clear=======:" + arrList);


    }
}
