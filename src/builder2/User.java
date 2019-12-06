package builder2;

public class User {
    public static void main(String[]args){
        showComputer();
    }
    private static void showComputer(){
        GetComputer computer = new GetComputer.Builder().setBoard("华擎").setGpu("英伟达").setMemory("32G").setCpu("AMD").build();
        System.out.printf("computer："+computer.getBoard()+computer.getCpu()+computer.getGpu()+computer.getMemory());
    }
}
