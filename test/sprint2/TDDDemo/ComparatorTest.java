package sprint2.TDDDemo;

import org.junit.jupiter.api.Test;


public class ComparatorTest {

    Comparator c = new Comparator();

    @Test
    public void compareTest(){
        int i1 = 45;
        int i2 = 65;

        assert(c.compare(i1, i2));
        assert(!c.compare(i2, i1));
        assert(!c.compare(i2, i2));

    }


}
