package brige;

public class M1A1 extends Tank {
    public M1A1(Armor armor) {
        super(armor);
    }

    @Override
    public void armed() {
        System.out.println("M1A1"+armor.addArmor());
    }
}
