package sprint2.serialisering;

import java.io.Serializable;

public class Person implements Serializable {

    protected String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
