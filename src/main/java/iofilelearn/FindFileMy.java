package iofilelearn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lixiaohu
 * @create 2023-06-12 14:04
 */
public class FindFileMy {
    public static void main(String[] args) {
        findFile("I:\\Excel");
    }

    public static void findFile(String path){
        File file = new File(path);
        ArrayList<String> strings = new ArrayList<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                findFile(file1.getPath());

            }else{
                String fileMD5String;
                try {
                    fileMD5String = FileToMD5.getFileMD5String(file1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                String outStr = file1.getPath() + ":" + file1.getName() + "@" + fileMD5String;
                System.out.println(outStr);
                if(outStr.contains("视频教程\\03章")){
                    strings.add(outStr);
                }
            }
        }

    }
}
