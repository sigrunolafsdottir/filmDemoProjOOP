package sprint2.TDDDemo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class IteratorTest {

    Iterator i = new Iterator();

    List<Integer> l = Arrays.asList(199,200,208,210,200,207,240,269,260,263);

    @Test
    public void interateTest(){

        System.out.println(i.iterate(l));

        assert(i.iterate(l) == 7);
        assert(i.iterate(l) != 6);

    }

}
