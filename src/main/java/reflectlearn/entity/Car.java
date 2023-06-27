package reflectlearn.entity;

/**
 * @author lixiaohu
 * @create 2023-06-27 13:06
 */
public class Car {
    public String brand = "baoma";
    public int price = 232332;
    public String color = "black";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
