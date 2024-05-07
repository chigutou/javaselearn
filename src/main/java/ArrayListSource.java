import bean.Cat;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author lixiaohu
 * @create 2023-03-25 20:24
 */
public class ArrayListSource {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("2.3");
        BigDecimal b2 = new BigDecimal("2.3");
        BigDecimal b3 = new BigDecimal("2.4");
        BigDecimal b4 = new BigDecimal("2.300");
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b3));
        System.out.println(b3.compareTo(b2));
        System.out.println(b4.equals(b2));
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(null));

        ArrayList list = new ArrayList(8);
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        for(int i = 11; i <= 15; i++){
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        System.out.println("a".substring(1).contains("adaf"));

        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("mao1");
        Cat cat1 = cat;
        cat1.setAge(2);
        cat1.setName("mao2");
        System.out.println(cat);
        System.out.println("=================");
        System.out.println(cat1);
        String t1 = "sfda";
        String t2 = t1;
        t2 = "123";
        System.out.println(t1);
        System.out.println(t2);
    }
}
