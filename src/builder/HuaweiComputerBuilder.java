package builder;

public class HuaweiComputerBuilder extends Builder {
    private Computer computer = new Computer();
    @Override
    Computer createComputer() {
        return computer;
    }

    @Override
    void buildBoard() {
        computer.setBoard("华硕 z370");
    }

    @Override
    void buildCpu() {
        computer.setCpu("intel i9-9900k");
    }

    @Override
    void buildGpu() {
        computer.setGpu("Nvidia RTX2080");
    }

    @Override
    void buildMemory() {
        computer.setMemory("16G");
    }
}
