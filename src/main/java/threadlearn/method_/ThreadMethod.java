package threadlearn.method_;

/**
 * @author lixiaohu
 * @create 2023-06-07 13:38
 */
public class ThreadMethod extends Thread {
    @Override
    public void run() {
        while (true) {
            int counts = 0;
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            System.out.println("T:" + Thread.currentThread().getName() + ";  " + (++counts));
            try {
                System.out.println("休眠ing");
                sleep(20000);
            } catch (InterruptedException e) {
                System.out.println("捕获了一个终端2异常");
//                throw new RuntimeException(e);
            }
        }
    }
}
