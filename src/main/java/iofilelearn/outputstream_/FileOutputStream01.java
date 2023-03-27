package iofilelearn.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lixiaohu
 * @create 2023-03-27 20:54
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        //创建FileOutputStream对象
        FileOutputStream fileOutputStream = null;
        String filePath = "e:\\a.txt";
        try {
            //此种创建方式是覆盖创建，当写入内容时会覆盖原来的内容。
//            fileOutputStream = new FileOutputStream(filePath);
            //使用此种模式为true的时候会追加模式。
            fileOutputStream = new FileOutputStream(filePath,true);
            fileOutputStream.write('a');
            String hello = "Hello World";
            fileOutputStream.write(hello.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
