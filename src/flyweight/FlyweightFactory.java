package flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String,FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyWeight(String extrinsic){
        FlyWeight flyWeight = null;
        if (pool.containsKey(extrinsic)){
            flyWeight = pool.get(extrinsic);
            System.out.printf("已有"+extrinsic+"直接从池中获取");
        }else {
            flyWeight = new ConcreteFlyweight(extrinsic);

            pool.put(extrinsic,flyWeight);
            System.out.printf("创建flyweight"+extrinsic+"并放入池中");
        }
        return flyWeight;
    }
}
