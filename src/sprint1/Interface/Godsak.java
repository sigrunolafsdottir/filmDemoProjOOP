package sprint1.Interface;

public abstract class Godsak {

    int kaloriinnehåll;

    public Godsak(){}

    public Godsak(int kaloriinnehåll) {
        this.kaloriinnehåll = kaloriinnehåll;
    }


    public int getKaloriinnehåll() {
        return kaloriinnehåll;
    }

    public void setKaloriinnehåll(int kaloriinnehåll) {
        this.kaloriinnehåll = kaloriinnehåll;
    }
}
