package threadlearn.method_;

/**
 * @author lixiaohu
 * @create 2023-06-07 20:55
 */
public class MyDaemonThread extends Thread{
    @Override
    public void run(){
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon:" );
        }
    }
}
