package sprint1.Huvudprogram;

public class Huvudprogram {

    int secretNumber = 4;

    int specialNumber(){
        return 9;
    }

    Huvudprogram (){
        System.out.println(secretNumber);
        System.out.println(specialNumber());

    }

    public static void main(String[] args){

        Huvudprogram h = new Huvudprogram();
    }
}
