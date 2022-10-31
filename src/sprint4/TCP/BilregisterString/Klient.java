package sprint4.TCP.BilregisterString;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Klient {

    public Klient(){

        try(
            Socket s = new Socket("127.0.0.1", 55555);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        ){

            String fromServer = "";
            String fromUser = "";

            fromServer = in.readLine();
            System.out.println(fromServer);

            while((fromUser = userInput.readLine()) != null){

                out.println(fromUser);
                System.out.println("Sent to server: "+fromUser);

                fromServer = in.readLine();
                System.out.println(fromServer);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public static void main(String[] args) {
        Klient k = new Klient();
    }
}
