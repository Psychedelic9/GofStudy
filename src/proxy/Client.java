package proxy;

public class Client implements Kill {
    @Override
    public void killMan() {
        System.out.println("客户要宰一个人");
    }
}
