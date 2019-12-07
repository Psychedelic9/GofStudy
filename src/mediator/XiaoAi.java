package mediator;

public class XiaoAi extends SmartMediator {
    public XiaoAi(SmartDevice bd1, SmartDevice bd2, SmartDevice bd3) {
        super(bd1, bd2, bd3);
    }

    @Override
    public void playMusic(String name) {
        bd3.powerOn();
        bd3.run();
    }

    @Override
    public void openDoor(String time) {
        bd1.powerOn();
        bd1.run();
        playMusic("");
        clean("");
    }

    @Override
    public void clean(String time) {
        bd2.powerOn();
        bd2.run();
    }
}
