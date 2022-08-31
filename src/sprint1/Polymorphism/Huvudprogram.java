package sprint1.Polymorphism;


public class Huvudprogram {


    public static void main(String[] args){

        Pepparkaka p1 = new Pepparkaka("bil", true, 500);

        Godsak g = new Godsak();
        System.out.println(g.kaloriinnehåll);
        System.out.println(g.toString());

        Pepparkaka p = new Pepparkaka();
        System.out.println(p.kaloriinnehåll);
        System.out.println(p.toString());


        System.out.println();
        Godsak g2 = new Pepparkaka();
        System.out.println(g2.kaloriinnehåll);
        System.out.println(g2.toString());

        System.out.println();
        Pepparkaka mp = new MandelPepparkaka();
        System.out.println(mp.toString());

    }
}
