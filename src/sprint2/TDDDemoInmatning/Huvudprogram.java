package sprint2.TDDDemoInmatning;

public class Huvudprogram {

    public static void main(String args[]){

        boolean isTest = false;
        Utils u = new Utils(5);
        System.out.println(u.doGame(false, -1));
    }
}
