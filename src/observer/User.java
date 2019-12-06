package observer;

public class User {
    public static void main(String[] args) {
        Target target = new Target();

        Sniper sniper1 = new Sniper("M82 A1");
        Sniper sniper2 = new Sniper("M24");
        Sniper sniper3 = new Sniper("AWM");

        target.addObserver(sniper1);
        target.addObserver(sniper2);
        target.addObserver(sniper3);

        target.inPosition("五道口");
    }
}
