package mediator;

public class SmartLock extends SmartDevice{

    @Override
    public void powerOn() {
        System.out.println("智能门锁已通电");
    }

    @Override
    public void run() {
        System.out.println("智能门锁已开启");
    }
}
