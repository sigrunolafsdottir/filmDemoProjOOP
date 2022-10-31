package sprint4.TCP.BilregisterProtokoll;

public class Protokoll {

    final protected int INITIAL = 0;
    final protected int INTHELOOP = 1;

    Database d = new Database();

    protected int state = INITIAL;

    public String getOutput(String fromClient){

        if (state == INITIAL){
            state = INTHELOOP;
            return "Hej och välkommen! Skriv in ett regnummer.";
        }
        else if (state == INTHELOOP){
            return d.search(fromClient);
        }
        return "Unexpected state eror";
    }



}
