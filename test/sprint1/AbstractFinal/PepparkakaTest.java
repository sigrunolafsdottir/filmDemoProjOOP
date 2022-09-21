package sprint1.AbstractFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PepparkakaTest {

    Pepparkaka p = new Pepparkaka();
    Pepparkaka pogräddad = new Pepparkaka("drake", false, 200);

    @Test
    void testToString() {
        assert(p.toString().equals("jag är en pepparkaka"));
        assert(!p.toString().equals("jag är en katt"));
    }

    @Test
    void gräddaTest(){
        assert(pogräddad.getGräddningsgrad() == false);
        pogräddad.grädda();
        assert(pogräddad.getGräddningsgrad() == true);
    }
}