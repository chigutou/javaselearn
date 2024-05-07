package collectionlearn;

import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author lixiaohu
 * @create 2023-03-25 19:55
 */
public class List_ {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DAY_OF_YEAR,1);
        Date temorrow = new Date(instance.getTimeInMillis());
        System.out.println(temorrow);


        // 获取当前日期
        Date today = new Date(System.currentTimeMillis());

        // 使用 Calendar 类来操作日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);

        // 增加一天
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        // 得到比今天多一天的日期
        Date tomorrow = new Date(calendar.getTimeInMillis());

        // 打印结果
        System.out.println("今天: " + today);
        System.out.println("明天: " + tomorrow);


        List list = new ArrayList<>();
        list.add("jack");

        list.add("tom");
        list.add("marry");
        list.add("july");
        list.add("july");
        System.out.println("list :" + list);
        System.out.println(list.get(2));
        String str = "hello word 12345678";
        System.out.println(str.substring(0,0));
        list.forEach(name -> System.out.println(name));
        list.forEach(System.out::println);


    }
}
