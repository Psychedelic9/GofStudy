package abstractFactory;

public class WeChatFactory extends AppFactory {
    @Override
    public App createAndroidApp() {
        return new WeChatAndroid();
    }

    @Override
    public App createIosApp() {
        return new WeChatIos();
    }
}
