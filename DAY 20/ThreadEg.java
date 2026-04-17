class sampleThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running using Thread class");
    }
}
class sampleThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread is sleeping for 4 seconds");
    }
}
public class ThreadEg {
    public static void main(String[] args){
        sampleThread t1 = new sampleThread();
        t1.start();
        sampleThread2 t2 = new sampleThread2(); 
        Thread t3 = new Thread(t2);
        t3.start();
    
    }
}