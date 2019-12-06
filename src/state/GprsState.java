package state;

public class GprsState implements State {
    @Override
    public void playVideo() {
        System.out.println("gprs state,do not play video");
    }

    @Override
    public void showTxt() {
        System.out.println("gprs state,show text");
    }
}
