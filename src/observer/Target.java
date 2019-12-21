package observer;

import java.util.Observable;

public class Target extends Observable {
    private String name;

    public Target(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void inPosition(String location){
        setChanged();
        notifyObservers(location);
    }
}
