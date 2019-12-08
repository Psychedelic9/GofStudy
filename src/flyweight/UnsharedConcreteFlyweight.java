package flyweight;

public class UnsharedConcreteFlyweight extends FlyWeight {
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight"+extrinsic);
    }
}