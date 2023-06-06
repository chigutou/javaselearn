package threadlearn;

/**
 * @author lixiaohu
 * @create 2023-06-06 13:06
 */
public class Thread01 {
    public static void main(String[] args) {
        //创建cat对象
        Cat cat = new Cat();
        cat.start();

    }
}

class Cat extends Thread{
    int times;
    @Override
    public void run(){//重写run（）方法实现自己的逻辑
        while (true) {
            System.out.println("thread01  one second " + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times == 10) {break;}
        }
    }
}
