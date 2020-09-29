package by.kunavich.task3.data.dataAcquier;

import by.kunavich.task3.data.AirplaneCamponyCreator;
import by.kunavich.task3.data.dataAcquirer.DataAcquirer;
import by.kunavich.task3.data.dataAcquirer.FileDataAcquirer;
import by.kunavich.task3.logic.Calculator;
import by.kunavich.task3.model.AirplaneCampony;
import org.junit.Assert;
import org.junit.Test;

public class FileDataAcquierTest {

    @Test
    public void getNameTest1() throws Exception {


        //given
        DataAcquirer dataAcquirer = new FileDataAcquirer();

        //whenn
        String actual = dataAcquirer.getName();
        //then
        Assert.assertEquals("PAVEL", actual);

    }
}
