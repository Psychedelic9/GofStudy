package brige;

public abstract class Tank {
    protected Armor armor;

    public Tank(Armor armor) {
        this.armor = armor;
    }
    public abstract void armed();
}
