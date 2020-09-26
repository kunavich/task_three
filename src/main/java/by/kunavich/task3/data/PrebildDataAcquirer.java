package by.kunavich.task3.data;

import java.util.ArrayList;
import java.util.List;

public class PrebildDataAcquirer implements DataAcquirer{
    private int ITERATOR =0;
    private List<String>NAME = new ArrayList<>();

    {
        NAME.add("PAVEL");
        NAME.add("VASILY");
        NAME.add("ALEX");
        NAME.add("TOMAS");
        NAME.add("IVAN");
    }

    public String getName() {


            String input = NAME.get(ITERATOR);
            ITERATOR++;
            if(ITERATOR >=NAME.size())
                ITERATOR =0;


            return input;




    }
}
