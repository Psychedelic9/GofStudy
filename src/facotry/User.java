package facotry;

public class User {
    public static void main(String[]args){
        CarFactory factory = new BmwFactory();
        factory.product().run();
        CarFactory factory2 = new BenzFactory();
        factory2.product().run();
    }
}
