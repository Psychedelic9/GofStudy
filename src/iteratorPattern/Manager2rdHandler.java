package iteratorPattern;

public class Manager2rdHandler extends AbstractLeaveHandler {
    public Manager2rdHandler(String name) {
        this.handlerManager = name;
    }

    @Override
    void handLeave(LeaveRequest request) {
        if (request.getLeaveDays()<=this.MIN){
            System.out.println("二级主管:"+handlerManager+"批准假期"+request.getLeaveDays()+"天");
            return;
        }
        if (null!=this.nextHandler){
            this.nextHandler.handLeave(request);
        }else {
            System.out.println("拒绝请假");
        }
    }
}
