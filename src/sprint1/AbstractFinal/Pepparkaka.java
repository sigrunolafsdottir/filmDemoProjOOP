package sprint1.AbstractFinal;

// kommentar


public class Pepparkaka extends sprint1.AbstractFinal.Godsak {

    private String form;
    private boolean gräddningsgrad;

    final int testInt = 4;

    public Pepparkaka(){}

    public Pepparkaka(String form, boolean gräddningsgrad, int k){
        super(k);
        this.form = form;
        this.gräddningsgrad=gräddningsgrad;
    }


    public String toString(){
        return "jag är en pepparkaka";
    }


}
