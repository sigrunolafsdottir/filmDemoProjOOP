package sprint1.ArraysList;


import java.util.Arrays;

public class HuvudprogramArray {

    public static void main(String[] args){

        Pepparkaka p1 = new Pepparkaka("bil", true, 500);
        Pepparkaka p2 = new Pepparkaka("drake", true, 7000);
        Pepparkaka p3 = new Pepparkaka("gris", false, 345);

        int[] numbers = {4,2,7,12,56,2,3};
        Pepparkaka[] p = {p1, p2, p3};

        Arrays.sort(numbers);

        for(int i : numbers){
            System.out.println(i);
        }

        for(Pepparkaka temp : p){
            System.out.println(temp.getForm());
        }

    }
}
