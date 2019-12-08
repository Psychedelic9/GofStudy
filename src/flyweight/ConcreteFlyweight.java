package flyweight;

public class ConcreteFlyweight extends FlyWeight {
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight："+extrinsic);
    }
}
