package sprint2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

    public FileReadDemo()  {

        String temp;

        try(FileReader fr = new FileReader("src/sprint2/song.txt");
            BufferedReader buf = new BufferedReader(fr)){

            /*
            while ((temp = fr.read()) != -1){
                System.out.println((char) temp);
            }
*/

            while((temp = buf.readLine()) != null){
                System.out.println(temp);
            }



        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main (String[] args){
        FileReadDemo frd = new FileReadDemo();
    }

}
