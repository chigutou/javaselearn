package threadlearn.threaduse;

/**
 * @author lixiaohu
 * @create 2024-07-15 23:30
 */
public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();// 启动线程
    }
}
//1. 当一个类继承了Thread类，该类可以当做线程使用
//2. 我们会重写run方法，写上自己的业务代码
//3. run Thread 类实现了Runnable 接口的run方法
class Cat extends Thread {
    int times = 0;
    @Override
    public void run(){
        while(true){
            System.out.println("miao miao wo shi xiao mao mi" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times == 20){
                break;
            }
        }
    }
}
