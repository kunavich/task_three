package by.kunavich.task3.model;

import java.util.ArrayList;
import java.util.List;

public class AirplaneCampony {
    List<Airplane> airplaneList;

    public AirplaneCampony()
    {
        airplaneList = new ArrayList<Airplane>();
    }

    public void addAirplane( Airplane airplane)    {
        airplaneList.add(airplane);
    }

    public List<Airplane> getAirplaneList() {
        return airplaneList;
    }
}
