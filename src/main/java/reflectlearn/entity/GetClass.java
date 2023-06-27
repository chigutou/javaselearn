package reflectlearn.entity;

/**
 * @author lixiaohu
 * @create 2023-06-27 20:09
 * 演示获取calss对象的6种方式
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName()
        Class<?> aClass = Class.forName("reflectlearn.entity.Car");
        System.out.println(aClass);
        //类.class
        Class<Cat> catClass = Cat.class;
        System.out.println(catClass);
        //对象.getClass
        Cat cat = new Cat();
        Class<? extends Cat> aClass1 = cat.getClass();
        System.out.println("getClass: " + aClass1);
        //类加载器（4种），加载阶段
        //1. 先得到类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("reflectlearn.entity.Car");
        System.out.println(aClass2);
        //基本数据类型.class
        // 基本数据类型的包装类.TYPE


    }
}
