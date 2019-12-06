package facotry;

public class BenzFactory implements CarFactory {
    @Override
    public Car product() {
        return new BenzCar();
    }
}
