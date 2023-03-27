package collectionlearn;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lixiaohu
 * @create 2023-03-25 19:07
 */
public class CollectionIterator {
    public static void main(String[] args) {
        ArrayList<Object> col = new ArrayList<>();
        col.add(new Book("红楼梦","曹雪芹",10));
        col.add(new Book("小李飞刀","古龙",2));
        col.add(new Book("三国演义","罗贯中",3));
        System.out.println("col ====:" + col);
        Iterator<Object> iterator = col.iterator();
        while(iterator.hasNext()){

            Object next = iterator.next();
            System.out.println(next);

        }
        System.out.println(iterator.hasNext());
        System.out.println("foreach");
        for (Object o: col) {
            System.out.println(o);
        }


    }

}

class Book{
    private String name;
    private String auth;
    private double price;

    public Book(String name, String auth, double price) {
        this.name = name;
        this.auth = auth;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auth='" + auth + '\'' +
                ", price=" + price +
                '}';
    }
}
