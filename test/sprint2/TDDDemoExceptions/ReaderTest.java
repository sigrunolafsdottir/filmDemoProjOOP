package sprint2.TDDDemoExceptions;


import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReaderTest {

    Reader r = new Reader();
    Path notHere = Paths.get("fds/fdsfsd/fdss");
    Path errorData = Paths.get("test/sprint2/TDDDemoExceptions/errordata.txt");


    @Test
    public void transformToIntFormatTest(){
        assert(r.transformToInt("234") == 234);
       // assert(r.transformToInt("fdgd") != 234);

        Throwable exception = assertThrows(NumberFormatException.class,
                () -> r.transformToInt("fdss"));
    }

    @Test
    public void readThrowNoSuchFileExceptionTest(){

        Throwable exception = assertThrows(NoSuchFileException.class,
                () -> r.read(notHere));
    }

    @Test
    public void readThrowNumberFormatExceptionTest(){

        Throwable exception = assertThrows(NumberFormatException.class,
                () -> r.read(errorData));
    }


}
