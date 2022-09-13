package sprint2;


import java.util.Scanner;

public class ScannerDemo {

    public ScannerDemo(){
        Scanner sc = new Scanner(System.in);
        int temp;

        while(true){
            System.out.println("Skriv en siffra");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
                System.out.println("Du skrev: " + temp);
            }
            else{
                sc.next();
            }
        }
    }

    public static void main (String[] args){
        ScannerDemo sc = new ScannerDemo();
    }

}
