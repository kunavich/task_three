package by.kunavich.task3.data;

import by.kunavich.task3.model.Passanger;

public class PassangerCreator {
    public Passanger createPassanger() throws Exception {
        DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer =dataAcquirerFactory.getDataAcquirer("PREBILD");
        Passanger passanger= new Passanger(dataAcquirer.getName());
        return passanger;



    }

}
