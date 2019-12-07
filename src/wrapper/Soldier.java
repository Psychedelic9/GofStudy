package wrapper;

public class Soldier extends Person {
    public Soldier() {
        setName("Soldier");
        armed();
    }

    @Override
    public void armed() {
        System.out.println(getName()+": 装备防弹衣");
    }
}
