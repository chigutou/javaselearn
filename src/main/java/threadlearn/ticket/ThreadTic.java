package threadlearn.ticket;

import sun.font.TrueTypeFont;

/**
 * @author lixiaohu
 * @create 2024-07-30 22:42
 */
public class ThreadTic implements Runnable{
    public int num = 50;
    public boolean loop = true;

    public synchronized void sell(){
        if(num < 0) {
            System.out.println("shou piao jieshu");
            loop = false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("剩余票数" + Thread.currentThread().getName() + "|@|" + (num--));
    }
    @Override
    public void run(){
        while (loop){
            sell();
        }
    }


}
