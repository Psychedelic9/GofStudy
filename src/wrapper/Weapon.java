package wrapper;

public class Weapon extends Person {
    private Person person;

    public Weapon(Person person) {
        this.person = person;
    }

    @Override
    public void armed() {
        person.armed();
    }
}
