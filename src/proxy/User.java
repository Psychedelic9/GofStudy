package proxy;

public class User {
    public static void main(String[] args) {
        Client client = new Client();
        Killer killer = new Killer(client);
        killer.killMan();
    }
}
