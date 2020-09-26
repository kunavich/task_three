package by.kunavich.task3.data;

public class DataAcquirerFactory {

    public DataAcquirer getDataAcquirer(String type)    {
        switch (type)        {
            case "CONSOLE":
                return new ConsoleDataAcquirer();
            case "PREBILD":
                return  new PrebildDataAcquirer();

            default:
                throw new RuntimeException("wrong type : "+type);
        }
    }
}
