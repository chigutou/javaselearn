package reflectlearn.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author lixiaohu
 * @create 2023-06-15 12:59
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/reflect.properties"));
        String catclasspath = properties.get("catclasspath").toString();
        String method01 = properties.get("method01").toString();
        String method02 = properties.get("method02").toString();
        Class<?> cls = Class.forName(catclasspath);
        Object o = cls.newInstance();
        System.out.println(cls.getTypeName());
        Method method1 = cls.getMethod(method01);
        method1.invoke(o);
        Method method2 = cls.getMethod(method02);
        method2.invoke(o);

    }
}
