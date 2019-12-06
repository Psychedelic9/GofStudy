package state;

public class User {
    public static void main(String[] args) {
        Context context = new Context(new GprsState());
        context.playVideo();
        context.showTxt();
        context.setState(new WifiState());
        context.playVideo();
        context.showTxt();
    }
}
