package mediator;

public class SmartAirCleaner extends SmartDevice {
    @Override
    public void powerOn() {
        System.out.println("空气净化器已通电");
    }

    @Override
    public void run() {
        System.out.println("空气净化器开启");
    }
}
