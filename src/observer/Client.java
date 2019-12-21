package observer;

import java.util.Observable;


public class Client {
    private Company company;
    private Target target;

    public Client() {
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void buyFierce(int price){
        if (target!=null){
            company.acceptMission(target,price);
        }
    }
    public void abortMission(String name){
        company.abortMission(name);
    }


}
