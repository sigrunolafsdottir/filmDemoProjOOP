package sprint1.Interface;

public class Pepparkaka extends Godsak implements Vara {

    private String form;
    private boolean gräddningsgrad;


    public Pepparkaka(){}

    public Pepparkaka(String form, boolean gräddningsgrad, int k){
        super(k);
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
        System.out.println("form: "+form+" gräddad: "+gräddningsgrad );
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }
}
