package iteratorPattern;

public class CEOManager extends AbstractLeaveHandler {
    public CEOManager(String name) {
        this.handlerManager = name;
    }

    @Override
    void handLeave(LeaveRequest request) {
        if (request.getLeaveDays()>MIDDLE && request.getLeaveDays()<MAX){
            System.out.println("CEO:"+handlerManager+"批准假期"+request.getLeaveDays()+"天");
            return;
        }
        if (null!=this.nextHandler){
            this.nextHandler.handLeave(request);
        }else {
            System.out.println("拒绝请假");
        }
    }
}
