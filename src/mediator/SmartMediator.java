package mediator;

public abstract class SmartMediator {
    SmartDevice bd1,bd2,bd3;

    public SmartMediator(SmartDevice bd1, SmartDevice bd2, SmartDevice bd3) {
        this.bd1 = bd1;
        this.bd2 = bd2;
        this.bd3 = bd3;
    }

    public abstract void playMusic(String name);
    public abstract void openDoor(String time);
    public abstract void clean(String time);
}
