package brige;

public class T90 extends Tank {
    public T90(Armor armor) {
        super(armor);
    }

    @Override
    public void armed() {
        System.out.println("T90"+armor.addArmor());
    }
}
