package threadlearn.ticket;

/**
 * @author lixiaohu
 * @create 2024-07-31 21:54
 */
public class DeadLock_ extends Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLock_(boolean flag){
        this.flag = flag;
    }

    public void run(){
        if(flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }else{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}
