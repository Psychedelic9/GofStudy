package brige;

public class User {
    public static void main(String[] args) {
        DefultArmor defultArmor = new DefultArmor();
        ReactiveArmor reactiveArmor = new ReactiveArmor();
        DepletedUraniumArmor depletedUraniumArmor = new DepletedUraniumArmor();

        M1A1 m1A1 = new M1A1(depletedUraniumArmor);
        m1A1.armed();

        Sherman sherman = new Sherman(defultArmor);
        sherman.armed();

        T90 t90 = new T90(reactiveArmor);
        t90.armed();

    }
}
