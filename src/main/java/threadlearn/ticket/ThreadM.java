package threadlearn.ticket;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixiaohu
 * @create 2024-07-30 22:46
 */
public class ThreadM {
    public static void main(String[] args) {
//        ThreadTic threadTic = new ThreadTic();
//        Thread thread1 = new Thread(threadTic);
//        Thread thread2 = new Thread(threadTic);
//        Thread thread3 = new Thread(threadTic);
//        thread1.start();
//        thread2.start();
//        thread3.start();
        System.out.println(isValid("0123456789"));
        System.out.println(isValid("01234567891"));
        System.out.println(isValid("012345678"));
        System.out.println(isValid("0123445678s"));
        Map map = new HashMap<>();
//        map.put(1,"sf");
        map.put("sf",1);
//        map.put(2,1);
        map.put("3","1");
        Map mas = null;
        if(map instanceof Map){
            mas =  (Map<String,String>) map;
        }
        System.out.println(mas.get("sf") instanceof String);
        System.out.println(mas.get("sf").equals("1"));


    }
    public static boolean isValid(String input) {
        // 正则表达式：精确匹配11位数字
        String regex = "^\\d{11}$";

        // 处理输入为null的情况
        if (input == null) {
            return false;
        }

        // 执行正则匹配
        return input.matches(regex);
    }
}
