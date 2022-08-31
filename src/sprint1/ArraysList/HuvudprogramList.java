package sprint1.ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuvudprogramList {

    public static void main(String[] args){

        Pepparkaka p1 = new Pepparkaka("bil", true, 500);
        Pepparkaka p2 = new Pepparkaka("drake", true, 7000);
        Pepparkaka p3 = new Pepparkaka("gris", false, 345);

        List<Pepparkaka> p = new ArrayList<>();

        List otypad = new ArrayList<>();

        p.add(p1);
        p.add(p2);
        p.add(p3);

        otypad.add(p1);
        otypad.add(p2);
        otypad.add(p3);

        for (Pepparkaka temp : p){
            System.out.println(temp.getForm());
        }
        System.out.println();

        for (Object temp : otypad){
            System.out.println(((Pepparkaka) temp).getForm());
        }

        System.out.println();
        Collections.shuffle(p);

        for (Pepparkaka temp : p){
            System.out.println(temp.getForm());
        }

    }
}
