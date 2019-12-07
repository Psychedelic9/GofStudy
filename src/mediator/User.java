package mediator;

public class User {
    public static void main(String[] args) {
        SmartLock lock = new SmartLock();
        SmartAirCleaner cleaner = new SmartAirCleaner();
        SmartMusicPlayer player = new SmartMusicPlayer();
        SmartMediator xiaoai = new XiaoAi(lock,cleaner,player);
        xiaoai.openDoor("");
    }
}
