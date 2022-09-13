package sprint2;

public class StringDemo {

    public StringDemo(){

        String s = "luftballong flygplan luftskepp";

        System.out.println(s.charAt(5));
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(4));
        System.out.println(s.indexOf("b"));
        System.out.println(s.startsWith("luft"));
        System.out.println(s.startsWith("ballong"));
        System.out.println(s.endsWith("luft"));
        System.out.println(s.endsWith("ballong"));
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.split(" ")[1]);


    }

    public static void main (String[] args){
        StringDemo sc = new StringDemo();
    }

}
