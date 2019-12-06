package iteratorPattern;

public abstract class AbstractLeaveHandler {
    int MIN = 1;
    int MIDDLE = 3;
    int MAX = 30;

    String handlerManager;
    AbstractLeaveHandler nextHandler;

    public void setNextHandler(AbstractLeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handLeave(LeaveRequest request);
}
