package builder;

public abstract class Builder {
    abstract Computer createComputer();
    abstract void buildBoard();
    abstract void buildCpu();
    abstract void buildGpu();
    abstract void buildMemory();
}
