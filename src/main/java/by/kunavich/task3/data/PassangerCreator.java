package by.kunavich.task3.data;

import by.kunavich.task3.data.dataAcquirer.DataAcquirer;
import by.kunavich.task3.data.dataAcquirer.DataAcquirerFactory;
import by.kunavich.task3.model.Passanger;

public class PassangerCreator {
    public Passanger createPassanger(String type) throws Exception {
        DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer =dataAcquirerFactory.getDataAcquirer(type);
        Passanger passanger= new Passanger(dataAcquirer.getName());
        return passanger;



    }
}
