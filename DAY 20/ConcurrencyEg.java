class SampleThread extends Thread {
    String name;
    SampleThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + i);
        }
    }
}
public class ConcurrencyEg {
    public static void main(String[] args) {
        SampleThread t1 = new SampleThread("Thread 1");
        SampleThread t2 = new SampleThread("Thread 2");
        t1.start();
        t2.start();
    }
}