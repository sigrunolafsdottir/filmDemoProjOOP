package sprint3.threadDemos;

public class PrinterWInterface implements Runnable{

    String mess;
    int interval;

    public PrinterWInterface(String mess, int interval){
        this.mess = mess;
        this.interval = interval;
    }

    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                System.out.println(mess);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }

}
