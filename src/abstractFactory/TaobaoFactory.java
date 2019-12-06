package abstractFactory;

public class TaobaoFactory extends AppFactory {
    @Override
    public App createAndroidApp() {
        return new TaobaoAndroid();
    }

    @Override
    public App createIosApp() {
        return new TaobaoIos();
    }
}
