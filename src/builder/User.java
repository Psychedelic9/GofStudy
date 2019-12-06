package builder;

public class User {
    public static void main(String[]args){
        getComputer(new DellComputerBuilder());
        getComputer(new HuaweiComputerBuilder());
    }

    private static void getComputer(Builder builder){
        Director director = new Director(builder);
        Computer computer = director.construct();
        System.out.printf("computer : "+computer.getBoard()+" "+computer.getCpu()+" "+computer.getGpu()+" "+computer.getMemory()+"\n");
    }
}
