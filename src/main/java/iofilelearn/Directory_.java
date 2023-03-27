package iofilelearn;

import java.io.File;

/**
 * @author lixiaohu
 * @create 2023-03-27 13:06
 */
public class Directory_ {
    public static void main(String[] args) {
//        m1();
//        m2();
        m3();
    }
    public static void m1(){
        String filePath = "e:\\news3.txt";
        File file = new File(filePath);
        if(file.exists()){
            boolean delete = file.delete();
            System.out.println(delete);
            if(delete){
                System.out.println("deleted");
            }else {
                System.out.println("deleted false");
            }
        }else {
            System.out.println("file is not found");
        }
    }
    public static void m2(){
        String filePath = "e:\\demo";
        File file = new File(filePath);
        if(file.exists()){
            boolean delete = file.delete();
            System.out.println(delete);
            if(delete){
                System.out.println("deleted");
            }else {
                System.out.println("deleted false");
            }
        }else {
            System.out.println("file is not found");
        }
    }

    public static void m3(){
        String dirPath = "e:\\demo\\a\\b\\c";
        File file = new File(dirPath);
        if(file.exists()){
            System.out.println("mulu yijingcunzai");

        }else {
            boolean mkdir = file.mkdirs();
            if(mkdir){
                System.out.println("chuangjianchenggong");
            }else {
                System.out.println("chuangjianshibai");
            }
        }
    }

}
