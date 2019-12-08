package flyweight;

public abstract class FlyWeight {
    private String intrinsic;

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    protected final String extrinsic;

    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
