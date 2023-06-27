package reflectlearn.entity;

import java.lang.reflect.Field;

/**
 * @author lixiaohu
 * @create 2023-06-27 13:07
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String clsPath = "reflectlearn.entity.Car";
        //获取class对象
        // <?>表示不确定的java类型
        Class<?> aClass = Class.forName(clsPath);
        //输出class,显示哪个类的对象，全类名class reflectlearn.entity.Car
        System.out.println(aClass);
        //输出Class类运行类型，[Ljava.lang.Class;@4aa298b7
        System.out.println(aClass.getClasses());
        //获取包名
        System.out.println(aClass.getPackage().getName());
        //全类名称
        System.out.println(aClass.getName());
        //生成对象实例
        Object o = aClass.newInstance();
        System.out.println(o);
        //获取属性
        Field brand = aClass.getField("brand");
        System.out.println(brand.get(o));
        //通过反射给属性赋值
        brand.set(o,"benchi");
        System.out.println(brand.get(o));
        // 获取所有属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ":" + field.get(o));
        }
    }
}
