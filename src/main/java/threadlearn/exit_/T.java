package threadlearn.exit_;

/**
 * @author lixiaohu
 * @create 2023-06-07 13:21
 */
public class T extends Thread{

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    private boolean loop = true;
    @Override
    public void run(){
        int counts=0;
        while (loop){
            System.out.println("T:" + Thread.currentThread().getName() + ";  "+ (++counts));
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
