package wrapper;

public class Pistol extends Weapon  {
    private String name;
    public Pistol(Person person) {
        super(person);
        this.name = person.getName();
    }
    private void get92G(){
        System.out.println(name+": 装备了92G");
    }
    private void getGlock17(){
        System.out.println(name+": 装备了Glock17");
    }
    private void getP250(){
        System.out.println(name+": 装备了p250");
    }
    private void getUSP(){
        System.out.println(name+": 装备了USP");
    }
    private void getFiveSeven(){
        System.out.println(name+": 装备了5.7");
    }

    @Override
    public void armed() {
        getFiveSeven();
    }
}
