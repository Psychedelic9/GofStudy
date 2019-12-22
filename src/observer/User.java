package observer;

public class User {
    public static void main(String[] args) {
        Company company = new Company();
        Target target = new Target("张三");
        Client client = new Client();
        client.setCompany(company);
        client.setTarget(target);
        client.buyFierce(20000);
        target.inPosition("奥体中心B2出口");
    }
}
