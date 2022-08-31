package sprint1.Polymorphism;

public class Godsak {

    int kaloriinnehåll = 1;

    public Godsak(){}

    public Godsak(int kaloriinnehåll) {
        this.kaloriinnehåll = kaloriinnehåll;
    }

    public String toString(){
        return "godsak";
    }

    public int getKaloriinnehåll() {
        return kaloriinnehåll;
    }

    public void setKaloriinnehåll(int kaloriinnehåll) {
        this.kaloriinnehåll = kaloriinnehåll;
    }
}
