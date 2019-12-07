package wrapper;

public class Police extends Person {
    public Police() {
        setName("Police");
        armed();
    }

    @Override
    public void armed() {
        System.out.println(getName()+": 装备防弹衣");
    }
}
