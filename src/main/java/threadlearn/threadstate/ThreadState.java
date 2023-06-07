package threadlearn.threadstate;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName() + "state1 is:" + t.getState());
        t.start();
        System.out.println(t.getName() + "state2 is:" + t.getState());
        while(Thread.State.TERMINATED != t.getState()){
            System.out.println(t.getName() + "state3 is:" + t.getState());
            Thread.sleep(555);
        }

        System.out.println(t.getName() + "state4 is:" + t.getState());

    }
}

class T extends Thread{
    @Override
    public void run(){
        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}
