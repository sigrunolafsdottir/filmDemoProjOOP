package sprint2.TDDDemo;

import java.util.List;

public class Iterator {

    public int iterate(List<Integer> l){
        int res = 0;
        Comparator c = new Comparator();

        for (int i = 0; i < l.size()-1; i++){
            if (c.compare(l.get(i), l.get(i+1))) res++;
        }

        return res;
    }
}
