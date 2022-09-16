package sprint2.TDDDemoExceptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Huvudprogram {

    public static void main(String[] args) throws Exception{

        Reader r = new Reader();
        Iterator i = new Iterator();
        Path p = Paths.get("src/sprint2/TDDDemoExceptions/data.txt");

        System.out.println(i.iterate(r.read(p)));


    }

}
