package brige;

public class Sherman extends Tank {
    public Sherman(Armor armor) {
        super(armor);
    }

    @Override
    public void armed() {
        System.out.println("Sherman"+armor.addArmor());
    }
}
