package observer;

import java.util.Observable;
import java.util.Observer;

public class Company extends Observable implements Observer {
    private Sniper sniper1;
    private Sniper sniper2;
    private Sniper sniper3;
    public Company() {
        sniper1 = new Sniper("001","M82 A1");
        sniper2 = new Sniper("002","M24");
        sniper3 = new Sniper("003","AWM");
        addObserver(sniper1);
        addObserver(sniper2);
        addObserver(sniper3);
    }

    @Override
    public void update(Observable o, Object arg) {
        setChanged();
        notifyObservers(arg);
    }

    public boolean acceptMission(Target target,int price){
        if (price<10000){
            System.out.println("公司拒绝订单，价格不够");
            return false;
        }else {
            publishMission(target);
            return true;
        }
    }
    public void abortMission(String name){
        this.deleteObservers();
        System.out.println("任务"+name+"取消");
    }
    public void publishMission(Target target){
        target.addObserver(this::update);
        setChanged();
        notifyObservers(target);
    }

}
