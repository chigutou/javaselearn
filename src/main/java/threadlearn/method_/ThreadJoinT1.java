package threadlearn.method_;

/**
 * @author lixiaohu
 * @create 2023-06-07 20:40
 */
public class ThreadJoinT1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
