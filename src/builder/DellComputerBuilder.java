package builder;

public class DellComputerBuilder extends Builder {
    private Computer computer = new Computer();
    @Override
    Computer createComputer() {
        return computer;
    }

    @Override
    void buildBoard() {
        computer.setBoard("华硕B350");
    }

    @Override
    void buildCpu() {
        computer.setCpu("Inter i5-4770k");
    }

    @Override
    void buildGpu() {
        computer.setGpu("Nvidia GTX1060");
    }

    @Override
    void buildMemory() {
        computer.setMemory("8G");
    }
}
