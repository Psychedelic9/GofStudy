package state;

public class WifiState implements State {
    @Override
    public void playVideo() {
        System.out.println("wifi state,play video");
    }

    @Override
    public void showTxt() {
        System.out.println("wifi state,show text");
    }
}
