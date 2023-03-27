package iofilelearn.inputstream_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lixiaohu
 * @create 2023-03-27 19:59
 */
public class FileInputStream_ {
    public static void main(String[] args) {
        readFile02();
    }
    public static void readFile02(){
        File file = new File("e:\\news1.txt");
        int readlen = 0;
        byte[] buf = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            while((readlen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readlen));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //单个字节读取效率比较低。
    public static void readFile(){
        File file = new File("e:\\news1.txt");
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            while((readData = fileInputStream.read()) != -1){
                System.out.print((char)readData);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
