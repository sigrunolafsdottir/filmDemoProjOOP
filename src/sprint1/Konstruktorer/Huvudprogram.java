package sprint1.Konstruktorer;

public class Huvudprogram {

    public static void main(String[] args){

        Pepparkaka p1 = new Pepparkaka("bil", true);
        Pepparkaka p2 = new Pepparkaka("hus", true);
        Pepparkaka p3 = new Pepparkaka("gubbe", true);
        Pepparkaka p4 = new Pepparkaka("gumma", false);
        Pepparkaka p5 = new Pepparkaka("drake", false);

        Pepparkaka p6 = new Pepparkaka();
        Pepparkaka p7 = new Pepparkaka("boll");

        p1.printMe();



    }
}
