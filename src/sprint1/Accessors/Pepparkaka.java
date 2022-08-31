package sprint1.Accessors;

public class Pepparkaka extends Godsak {

    String form;
    private boolean gräddningsgrad;

    public Pepparkaka(){}

    public Pepparkaka(String form, boolean gräddningsgrad ){
        this.form = form;
        this.gräddningsgrad=gräddningsgrad;
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
        System.out.println("form: "+form+" gräddad? "+gräddningsgrad);
    }
}
