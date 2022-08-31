package sprint1.enums;

public class Pepparkaka extends Godsak {


    protected Form form = Form.GUBBE;

    private boolean gräddningsgrad;

    public Form getForm(){
        return form;
    }

    public boolean getGräddningsgrad(){
        return gräddningsgrad;
    }

    public void setForm(Form f){
        form = f;
    }

    public void setGräddningsgrad(boolean g){
        gräddningsgrad = g;
    }
}
