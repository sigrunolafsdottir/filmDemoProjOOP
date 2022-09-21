package sprint2.TDDDemoInmatning;

import org.junit.jupiter.api.Test;

public class UtilsTest {


    int secretnumber = 3;
    int notSecretnumber = 5;
    Utils u = new Utils(secretnumber);

    @Test
    public void compareTest(){
        assert(u.compare(secretnumber));
        assert(!u.compare(notSecretnumber));
    }

    @Test
    public void gameTest(){
        boolean istest=true;
        int userMockInputCorrect = 3;
        int userMockInputWrong = 1;
        assert(u.doGame(istest,userMockInputCorrect ));
        assert(!u.doGame(istest,userMockInputWrong ));
    }



}
