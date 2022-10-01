package sprint1.HardCodingExample;

import javax.swing.*;

/*
OBS, Ni ska INTE skriva så här, detta är ett exempel på dålig kod
 */

public class Huvudprogram {

    public Huvudprogram(){

        //Att skriva namnet på nedanstående sätt kan, tekniskt sett, betraktas som hårdkodning.
        //Detta tycker jag dock är ok i denna uppgift då inga krav har ställts på att ni ska
        //läsa från fil eller skapa en "Lägg till ny växt"-funktion.
        //I produktionsmässiga, storskapiga program brukar man inte skapa data på dtta sätt
        //utan man läser in datat från en databas. Det kommer ni att få lära er i databas-kursen :)
        Kaktus igge = new Kaktus("Igge");

        String VäxtSOmSkaHaVätska = JOptionPane.showInputDialog("Vem ska ha vätska");

        //Dubbellagra INTE namnet, läs istället namnen från de instantierade objekten
        if (VäxtSOmSkaHaVätska.equals("Igge")){
            //Låt INTE info som hör hemma i en klass flyta runt i huvudprogrammet
            System.out.println("Denna växt ska ha 0,2 cl mineralvatten");
        }

    }

    public static void main(String[] args){
        Huvudprogram h = new Huvudprogram();
    }
}
