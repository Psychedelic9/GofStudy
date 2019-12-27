package templateMethod;

public class Client {
    public static void main(String[] args) {
        AlibabaRecruit alibabaRecruit = new AlibabaRecruit();
        WandaRecruit wandaRecruit = new WandaRecruit();
        alibabaRecruit.recruit();
        wandaRecruit.recruit();
    }
}
