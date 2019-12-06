package iteratorPattern;

public class Manager1stHandler extends AbstractLeaveHandler {
    public Manager1stHandler(String name) {
        this.handlerManager = name;
    }

    @Override
    void handLeave(LeaveRequest request) {
        if (request.getLeaveDays()>MIN && request.getLeaveDays()<MIDDLE){
            System.out.println("一级主管:"+handlerManager+"批准假期"+request.getLeaveDays()+"天");
            return;
        }
        if (null!=this.nextHandler){
            this.nextHandler.handLeave(request);
        }else {
            System.out.println("拒绝请假");
        }
    }
}
