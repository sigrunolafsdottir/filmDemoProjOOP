package sprint2;


import jdk.dynalink.StandardOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class PathDemo {

    public PathDemo()  {

        Path p = Paths.get("src/sprint2/pathTest.txt");
        Path p1 = Paths.get("src/sprint2/pathTest1.txt");
        Path p2 = Paths.get("src/sprint2/pathTest2.txt");
        Path song = Paths.get("src/sprint2/song.txt");

        try(BufferedReader br = Files.newBufferedReader(song);
            BufferedWriter bw = Files.newBufferedWriter(p2)){


            String temp;

            while((temp = br.readLine()) != null){
                bw.write(temp);
                bw.newLine();
            }


        /*    if(!Files.exists(p)) {
                Files.createFile(p);
            }

           // Files.copy(p, p1);
           // Files.move(p, p2);
            Files.delete(p2); */
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main (String[] args){
        PathDemo pd = new PathDemo();
    }
}
