package sprint2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public double divide(int i) throws ArithmeticException{
        String[] s = new String[10];
        System.out.println(s[11]);
        //throw new ArithmeticException();
            return 10/i;

    }

    public Exceptions(){

        Scanner sc = new Scanner(System.in);
        int temp = 4;
        try {
            temp= sc.nextInt();
            double d = divide(temp);
            System.out.println(d);
        }

        catch(InputMismatchException e){
            System.out.println("det blev fel");
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("det blev fel");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Exceptions e = new Exceptions();
    }
}
