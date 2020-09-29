package by.kunavich.task3.logic;

import by.kunavich.task3.data.AirplaneCamponyCreator;
import by.kunavich.task3.model.AirplaneCampony;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void calculatePassgersTest1() throws Exception {


        //given
        AirplaneCamponyCreator airplaneCamponyCreator = new AirplaneCamponyCreator();
        AirplaneCampony airplaneCampony = airplaneCamponyCreator.createAirplaneCompany("FILE");

        Calculator calculator = new Calculator();


        //whenn
        int actual = calculator.calculatePassgers(airplaneCampony, 0);
        //then
        Assert.assertEquals(5, actual);

    }


}
