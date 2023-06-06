package iofilelearn.filereader_;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lixiaohu
 * @create 2023-03-28 13:13
 */
public class FileReader_ {
    public static void main(String[] args) {

//        String filePath = "e:\\news1.txt";
//        FileReader fileReader = null;
//        int data;
//        try {
//            fileReader = new FileReader(filePath);
//            while ((data = fileReader.read()) != -1){
//                System.out.print((char)data);
//
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally{
//            if(fileReader != null) {
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
    }

    @Test
    public void read01(){
        String filePath = "e:\\news1.txt";
        FileReader fileReader = null;
        char[] data = new char[8];
        int len;
        try {
            fileReader = new FileReader(filePath);
            while ((len = fileReader.read(data)) != -1){
                System.out.print(new String(data,0,len));

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Test
    public void test01(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(new Date()));
    }


}
