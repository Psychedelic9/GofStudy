package mediator;

public class SmartMusicPlayer extends SmartDevice {
    @Override
    public void powerOn() {
        System.out.println("智能音箱已通电");
    }

    @Override
    public void run() {
        System.out.println("智能音箱开始播放音乐");
    }
}
