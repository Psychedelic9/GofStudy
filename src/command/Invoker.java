package command;

public class Invoker {
    private Command mCommand;

    public void setmCommand(Command mCommand) {
        this.mCommand = mCommand;
    }

    public Invoker(Command mCommand) {
        this.mCommand = mCommand;
    }
    public void action(){
        mCommand.execute();
    }
}
