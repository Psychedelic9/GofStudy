package command;

public class PowerOnCommand extends Command {
    private Receiver receiver;

    public PowerOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
