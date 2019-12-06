package observer;

import java.util.Observable;
import java.util.Observer;

public class Sniper implements Observer {

    public Sniper(String weapon) {
        this.weapon = weapon;
    }

    private String weapon;

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("目标出现："+arg+" 即将使用"+weapon+"击毙");
    }
}
