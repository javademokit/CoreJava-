package FutureDemo_example;
public class Synch {
    // Sleeps for 5 seconds
    private static void do_stuff() {
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
    }
    public synchronized static void m1() {
        do_stuff();
    }
    public synchronized static void m2() {
        do_stuff();
    }
    public static void main(String[] args) {
        Thread t1 = new Thread() {
                public void run() {
                    Synch s = new Synch();
                    s.m1();
                }
            };
        Thread t2 = new Thread() {
                public void run() {
                    Synch s = new Synch();
                    s.m2();
                }
            };
        t1.start();
        t2.start();
        System.out.println("Done");
    }
}