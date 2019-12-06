package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Computer construct(){
        builder.buildBoard();
        builder.buildCpu();
        builder.buildGpu();
        builder.buildMemory();
        return builder.createComputer();
    }
}
