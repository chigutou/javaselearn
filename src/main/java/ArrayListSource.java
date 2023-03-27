import java.util.ArrayList;

/**
 * @author lixiaohu
 * @create 2023-03-25 20:24
 */
public class ArrayListSource {
    public static void main(String[] args) {
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

    }
}
