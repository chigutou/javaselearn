package iofilelearn.outputstream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lixiaohu
 * @create 2023-03-27 22:46
 */
public class FileCopy {
    public static void main(String[] args) {

    }

    @Test
    public void copyFile(){
        //1. 创建文件输入流，将文件读入程序
        //2. 创建文件输出流，将文件写到指定的位置
        String iFilePath = "e:\\3.png";
        String oFilePath = "e:\\3-copy.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[8];
        int len;
        try {
            fileInputStream = new FileInputStream(iFilePath);
            fileOutputStream = new FileOutputStream(oFilePath,true);
            while((len = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,len);
            }
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(fileInputStream != null)
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(fileOutputStream != null)
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
