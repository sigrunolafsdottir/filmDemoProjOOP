package sprint3.threadDemos;

public class TrådDemo {


    public static void main(String[] args) throws InterruptedException {

        Printer p1 = new Printer("Hej", 1000);
        Printer p2 = new Printer("på", 2000);
        Printer p3 = new Printer("Dig", 3000);

        p1.start();
        p2.start();
        p3.start();

    /*    p1.run();    //inte korrekt minneshantering
        p2.run();       //parallell-processingen kommer inte att funka!!!
        p3.run();  */

        Thread.sleep(10000);

        p1.interrupt();
        p2.interrupt();
        p3.interrupt();
    }

}
