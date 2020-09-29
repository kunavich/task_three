package by.kunavich.task3.data;

import by.kunavich.task3.model.Airplane;
import by.kunavich.task3.model.AirplaneCampony;

public class AirplaneCamponyCreator {
    public AirplaneCampony createAirplaneCompany(String type) throws Exception {
        AirplaneCampony airplaneCampony = new AirplaneCampony();
        AirplaneCreator airplaneCreator = new AirplaneCreator();

        airplaneCampony.addAirplane(airplaneCreator.createAirplane(type));

        return airplaneCampony;
    }
}
