package by.kunavich.task3.model;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    List<Passanger> passangerList;

    public Airplane()    {
        passangerList =new ArrayList<Passanger>();

    }
    public void addPassenger(Passanger passanger)    {
        passangerList.add(passanger);

    }

    public List<Passanger> getPassangerList() {
        return passangerList;
    }

}
