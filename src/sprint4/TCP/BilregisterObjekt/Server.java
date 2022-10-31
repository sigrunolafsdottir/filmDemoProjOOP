package sprint4.TCP.BilregisterObjekt;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    Database d = new Database();

    public Server(){

        try(ServerSocket ss = new ServerSocket(55555);
            Socket s = ss.accept();
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ){

            out.writeObject("Hej och välkommen! Skriv in ett regnummer.");
            String clientRequest = "";

            while((clientRequest = in.readLine()) != null){
                Bil dbAnswer = d.search(clientRequest.trim());
                if (dbAnswer == null){
                    out.writeObject("Bilen kunde inte hittas");
                }
                out.writeObject(dbAnswer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Server s = new Server();
    }
}
