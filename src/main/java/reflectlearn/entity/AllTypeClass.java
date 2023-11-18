package reflectlearn.entity;

/**
 * @author lixiaohu
 * @create 2023-06-27 20:50
 */
public class AllTypeClass {
    public static void main(String[] args) {
        String str = "asdfafdad#222salfdlasfd";
        int i = str.indexOf("#");
        System.out.println(i);
        String substring = str.substring(i);
        System.out.println(substring);
        System.out.println(str.substring(0,i));
    }
}
