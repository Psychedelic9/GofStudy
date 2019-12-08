package flyweight;

public class User {
    public static void main(String[] args) {
         int extrinsic = 998;
         FlyWeight flyWeightA = FlyweightFactory.getFlyWeight("A");
         flyWeightA.operate(++extrinsic);
         FlyWeight flyWeightB = FlyweightFactory.getFlyWeight("B");
         flyWeightB.operate(++extrinsic);
         FlyWeight flyWeightC = FlyweightFactory.getFlyWeight("A");
         flyWeightC.operate(++extrinsic);
         FlyWeight flyWeightD = new UnsharedConcreteFlyweight("A");
         flyWeightD.operate(++extrinsic);
    }
}
