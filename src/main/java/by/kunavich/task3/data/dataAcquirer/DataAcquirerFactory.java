package by.kunavich.task3.data.dataAcquirer;

public class DataAcquirerFactory {

    public DataAcquirer getDataAcquirer(String type)    {
        switch (type)        {
            case "CONSOLE":
                return new ConsoleDataAcquirer();
            case "PREBILD":
                return  new PrebildDataAcquirer();
            case "FILE":
                return  new FileDataAcquirer();

            default:
                throw new RuntimeException("wrong type : "+type);
        }
    }
}
