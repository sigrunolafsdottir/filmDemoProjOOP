package sprint1.Polymorphism;

public class Pepparkaka extends Godsak {

    private String form;
    private boolean gräddningsgrad;

    int kaloriinnehåll = 2;

    public Pepparkaka(){}

    public Pepparkaka(String form, boolean gräddningsgrad, int k){
        super(k);
        this.form = form;
        this.gräddningsgrad=gräddningsgrad;

    }


    public String toString(){
        return "pepparkaka";
    }



    public Pepparkaka(String f ){
        form = f;
    }

    public String getForm(){
        return form;
    }

    public void setForm(String f){
        form = f;
    }

    public boolean getGräddningsgrad(){
        return gräddningsgrad;
    }

    public void setGräddningsgrad(boolean g){
        gräddningsgrad = g;
    }

    public void printMe(){
        System.out.println("form: "+form+" gräddad: "+gräddningsgrad );
    }
}
