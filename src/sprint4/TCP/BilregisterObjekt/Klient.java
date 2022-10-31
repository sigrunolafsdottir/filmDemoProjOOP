package sprint4.TCP.BilregisterObjekt;


import java.io.*;
import java.net.Socket;

public class Klient {

    public Klient(){

        try(
                Socket s = new Socket("127.0.0.1", 55555);
                PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                ObjectInputStream in = new ObjectInputStream(s.getInputStream());
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        ){

            Object fromServer = "";
            String fromUser = "";

            fromServer = in.readObject();
            System.out.println(fromServer);

            while((fromUser = userInput.readLine()) != null){

                out.println(fromUser);
                System.out.println("Sent to server: "+fromUser);

                fromServer = in.readObject();

                if (fromServer instanceof Bil){
                    Bil b = (Bil) fromServer;
                    System.out.println(b.getOwner()+" "+b.getBrand()+" "+b.getColor()+" "+b.getRegNr());
                }
                else if (fromServer instanceof String){
                    System.out.println(fromServer);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Klient k = new Klient();
    }
}
