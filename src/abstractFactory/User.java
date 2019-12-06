package abstractFactory;

public class User {
    public static void main(String[] args) {
        TaobaoFactory factory1 = new TaobaoFactory();
        WeChatFactory factory2 = new WeChatFactory();

        factory1.createAndroidApp().run();
        factory1.createIosApp().run();
        factory2.createAndroidApp().run();
        factory2.createIosApp().run();
    }
}
