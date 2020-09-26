package by.kunavich.task3.data;

import by.kunavich.task3.model.Airplane;
import by.kunavich.task3.model.Passanger;

public class AirplaneCreator {
    public Airplane createAirplane() throws Exception {
        Airplane airplane = new Airplane();
        PassangerCreator passangerCreator = new PassangerCreator();
        for (int i=0;i<5;i++ ) {
            airplane.addPassenger(passangerCreator.createPassanger());
        }
        return airplane;
    }
}
