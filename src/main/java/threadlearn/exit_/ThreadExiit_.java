package threadlearn.exit_;

/**
 * @author lixiaohu
 * @create 2023-06-07 13:23
 */
public class ThreadExiit_ {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.setLoop(false);
    }
}
