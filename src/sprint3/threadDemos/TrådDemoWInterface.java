package sprint3.threadDemos;

public class TrådDemoWInterface {


    public static void main(String[] args) throws InterruptedException {

        PrinterWInterface p1 = new PrinterWInterface("Hej", 1000);
        PrinterWInterface p2 = new PrinterWInterface("på", 2000);
        PrinterWInterface p3 = new PrinterWInterface("Dig", 3000);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(10000);

        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }

}
