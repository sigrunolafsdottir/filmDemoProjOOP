package sprint2.TDDDemo;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReaderTest {

    //läser in data, transformera till integer, lägga i lista

    Reader r = new Reader();
    Path p = Paths.get("test/sprint2/TDDDemo/data.txt");

    @Test
    public void transformToIntegerTest(){
        String s1 = "345";
        String s2 = "45 ";

        assert(r.transformToInt(s1) == 345);
        assert(r.transformToInt(s2) == 45);

    }

    @Test
    public void readToIntListTest(){

        List<Integer> l = r.read(p);

        assert(l.size() == 10);
        assert(l.get(0) == 199);
        assert(l.get(1) == 200);
        assert(l.get(1) != 199);

    }




}
