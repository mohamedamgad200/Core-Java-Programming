package threads.example2;

public class MultiThreadDemo {
    public static void main(String[] args) throws Exception{
        RunnableTarget anr=new RunnableTarget();
        Thread th1=new Thread(anr);
        th1.setName("Thread 1");
        Thread th2=new Thread(anr);
        th2.setName("Thread 2");
        Thread th3=new Thread(anr);
        th3.setName("Thread 3");
        System.out.println("Thread State of th1 before calling start : "+th1.getState());
        th1.start();
        th2.start();
        th3.start();
        System.out.println("Thread State of th1 in Main method before calling sleep : "+th1.getState());
        System.out.println("Thread State of th2 in Main method before calling sleep : "+th2.getState());
        System.out.println("Thread State of th3 in Main method before calling sleep : "+th3.getState());
        Thread.sleep(1000);
        System.out.println("Thread State of th1 in Main method after calling sleep : "+th1.getState());
        System.out.println("Thread State of th2 in Main method after calling sleep : "+th2.getState());
        System.out.println("Thread State of th3 in Main method after calling sleep : "+th3.getState());
    }
}
