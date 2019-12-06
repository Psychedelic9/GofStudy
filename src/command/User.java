package command;

public class User {
    public static void main(String[] args) {
        Receiver receiver = new TVReceiver();
        Command command = new PowerOnCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
