package sprint1.AbstractFinal;

// kommentar


public class Pepparkaka extends
        Godsak {

    private String form;
    private boolean gräddningsgrad;

    final int testInt = 4;

    public Pepparkaka(){}

    public Pepparkaka(String form, boolean gräddningsgrad, int k){
        super(k);
        this.form = form;
        this.gräddningsgrad=gräddningsgrad;
    }

    public boolean getGräddningsgrad(){
        return gräddningsgrad;
    }

    public void grädda(){
        gräddningsgrad = true;
    }

    public String toString(){
        return "jag är en pepparkaka";
    }


}
