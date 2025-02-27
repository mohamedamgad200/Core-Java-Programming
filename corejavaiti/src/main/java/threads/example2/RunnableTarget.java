package threads.example2;

public class RunnableTarget implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Run by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread state by " + Thread.currentThread().getName()+" - "+Thread.currentThread().getState());
    }
}
