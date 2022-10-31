package sprint3.threadDemos;

public class Printer extends Thread{

    String mess;
    int interval;

    public Printer(String mess, int interval){
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
