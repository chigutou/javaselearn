package collectionlearn;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lixiaohu
 * @create 2023-03-25 19:07
 */
public class CollectionIterator {
    public static void main(String[] args) {

        System.out.println(System.getProperty("PATH"));
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
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("======for each=========");
        for (Object list :col) {
            System.out.println(list);

        }
        System.out.println("===========for============");
        for (int i = 0; i < col.size(); i++) {
            System.out.println(col.get(i));
        }
        sort(col);
        System.out.println("===========sort============");
        System.out.println(col);

    }

    public static void sort(List list){
        if(list.isEmpty()) return;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if(book1.getPrice() > book2.getPrice()){
                    list.set(j+1,book1);
                    list.set(j,book2);
                }
            }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
