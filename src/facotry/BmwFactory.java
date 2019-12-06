package facotry;

public class BmwFactory implements CarFactory {
    @Override
    public Car product() {
        return new BmwCar();
    }
}
