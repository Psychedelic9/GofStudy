package wrapper;

public class Rifle extends Weapon {
    private String name;
    public Rifle(Person person) {
        super(person);
        this.name = person.getName();
    }

    private void getHK416(){
        System.out.println(name+": 装备了HK416");
    }
    private void getFamas(){
        System.out.println(name+": 装备了法玛斯");
    }
    private void getType95(){
        System.out.println(name+": 装备了95式");
    }
    private void getAK74(){
        System.out.println(name+": 装备了AK74");
    }

    @Override
    public void armed() {
        getHK416();
    }
}
