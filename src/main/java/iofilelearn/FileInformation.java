package iofilelearn;

import java.io.File;
import java.sql.SQLOutput;

/**
 * @author lixiaohu
 * @create 2023-03-27 13:00
 */
public class FileInformation {
    public static void main(String[] args) {

        info();
    }

    public static void info(){
        File file = new File("e:\\news3.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParentFile());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
