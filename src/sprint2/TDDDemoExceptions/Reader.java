package sprint2.TDDDemoExceptions;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public int transformToInt(String s){
        return Integer.parseInt(s.trim());
    }

    public List<Integer> read(Path p) throws Exception {

        List<Integer> res = new ArrayList();
        String temp;

        try(BufferedReader buf = Files.newBufferedReader(p)){
            while((temp = buf.readLine()) != null){
                res.add(transformToInt(temp));
            }

        }

        return res;
    }
}
