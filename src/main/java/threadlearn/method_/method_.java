package threadlearn.method_;

/**
 * @author lixiaohu
 * @create 2023-06-07 13:38
 */
public class method_ {

    public static void main(String[] args) throws InterruptedException {
//        ThreadMethod threadMethod = new ThreadMethod();
//        threadMethod.start();
//        ThreadJoinT1 threadJoinT1 = new ThreadJoinT1();
//        threadJoinT1.start();
//        for(int i = 0; i < 60; i++){
//            System.out.println("main:" + i);
//            if(i == 5){
////                threadJoinT1.join();
//                Thread.yield();
//            }
//            Thread.sleep(100);
//        }
//        threadMethod.interrupt();

        MyDaemonThread mdt = new MyDaemonThread();
        mdt.setDaemon(true);
        mdt.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("main : " + i);
        }

    }
}
