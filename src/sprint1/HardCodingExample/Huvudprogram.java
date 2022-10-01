package sprint1.HardCodingExample;

import javax.swing.*;

/*
OBS, Ni ska INTE skriva så här, detta är ett exempel på dålig kod
 */

public class Huvudprogram {

    public Huvudprogram(){

        Kaktus igge = new Kaktus("Igge");

        String VäxtSOmSkaHaVätska = JOptionPane.showInputDialog("Vem ska ha vätska");

        //Dubbellagra INTE namnet, läs istället från de instantierade objekten
        if (VäxtSOmSkaHaVätska.equals("Igge")){
            //Låt INTE info som hör hemma i en klass flyta runt i huvudprogrammet
            System.out.println("Denna växt ska ha 0,2 cl mineralvatten");
        }

    }

    public static void main(String[] args){
        Huvudprogram h = new Huvudprogram();
    }
}
