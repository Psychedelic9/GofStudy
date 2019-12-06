package builder2;

public class Computer {
    private String board;
    private String cpu;
    private String gpu;
    private String memory;

    public Computer(String board, String cpu, String gpu, String memory) {
        this.board = board;
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
    }


    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
