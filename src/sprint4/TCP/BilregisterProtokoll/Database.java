package sprint4.TCP.BilregisterProtokoll;

import java.util.List;

public class Database {

    Bil b1 = new Bil("asd123", "Astor", "Volvo", "röd");
    Bil b2 = new Bil("wer345", "Bosse", "Saab", "blå");
    Bil b3 = new Bil("rty567", "Cecil", "Fiat", "gul");
    Bil b4 = new Bil("cvb890", "Doris", "Audi", "orange");
    Bil b5 = new Bil("sdf234", "Ester", "Toyota", "svart");

    List <Bil> data = List.of(b1, b2, b3, b4, b5);

    public Database(){}

    public String search(String regnr){
        for (Bil b : data){
            if (b.getRegNr().equals(regnr)){
                return allData(b);
            }
        }
        return "Denna bil fanns inte i registret";
    }

    public String allData(Bil b){
        return b.regNr+" "+b.brand+" "+b.owner+" "+b.color;
    }

}
