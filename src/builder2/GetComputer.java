package builder2;

public class GetComputer {
    private String board;
    private String cpu;
    private String gpu;
    private String memory;
    public GetComputer(){

    }

    public String getBoard() {
        return board;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMemory() {
        return memory;
    }

    private GetComputer(Builder builder){
        this.board = builder.board;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.memory = builder.memory;
    }
    public static class Builder{
        private String board;
        private String cpu;
        private String gpu;
        private String memory;

        public Builder(){}
        public Builder setCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder setBoard(String board){
            this.board = board;
            return this;
        }
        public Builder setGpu(String gpu){
            this.gpu = gpu;
            return this;
        }
        public Builder setMemory(String memory){
            this.memory = memory;
            return this;
        }
        public GetComputer build(){
            return new GetComputer(this);
        }

    }
}
