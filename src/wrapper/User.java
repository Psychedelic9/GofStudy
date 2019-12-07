package wrapper;

public class User {
    public static void main(String[] args) {
        Person police = new Police();
        Person soldier = new Soldier();
        Pistol pistol = new Pistol(police);
        Rifle rifle = new Rifle(soldier);
        Pistol pistol2 = new Pistol(soldier);
        pistol.armed();
        pistol2.armed();
        rifle.armed();
    }
}
