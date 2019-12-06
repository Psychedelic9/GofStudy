package observer;

import java.util.Observable;

public class Target extends Observable {
    public void inPosition(String location){
        setChanged();
        notifyObservers(location);
    }
}
