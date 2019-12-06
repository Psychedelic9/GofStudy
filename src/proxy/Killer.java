package proxy;

public class Killer implements Kill {
    private Client client;

    public Killer(Client client) {
        this.client = client;
    }

    @Override
    public void killMan() {
        client.killMan();
    }
}
