package observer;

import java.util.Observable;
import java.util.Observer;

public class Sniper implements Observer {

    public Sniper(String no,String weapon) {
        this.weapon = weapon;
        this.no = no;
    }
    private String no;
    private String weapon;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String){
            System.out.println("目标出现："+arg+no+"号即将使用"+weapon+"击毙目标");
        }else if (arg instanceof Target){
            System.out.println(no+"号接收任务，目标："+((Target) arg).getName());
        }
    }
}
