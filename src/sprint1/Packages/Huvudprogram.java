package sprint1.Packages;

import sprint1.Packages.testPackage1.testPack2.testPack3.testPack3;

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

        testPack3 tp3 = new testPack3();

    }
}
