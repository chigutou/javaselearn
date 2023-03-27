package iofilelearn;

import java.io.File;
import java.io.IOException;

/**
 * @author lixiaohu
 * @create 2023-03-27 12:48
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {
        // 第一种
        create01();
        create02();
        create03();
    }

    public static void create01(){
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("create01 ok");
    }

    public static void create02(){
        String parentPath = "e:\\";
        String filePath = "news2.txt";
        File file = new File(parentPath,filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("create02 ok");
    }

    public static void create03(){
        String parentPath = "e:\\";
        File file1 = new File(parentPath);
        String filePath = "news3.txt";
        File file = new File(file1,filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("create03 ok");
    }
}
