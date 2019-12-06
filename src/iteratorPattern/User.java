package iteratorPattern;

public class User {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest(25,"马达加斯加");

        Manager2rdHandler handler2 = new Manager2rdHandler("张警官");
        Manager1stHandler handler1 = new Manager1stHandler("王总");
        CEOManager handler = new CEOManager("沈经理");
 
        handler2.setNextHandler(handler1);
        handler1.setNextHandler(handler);

        handler2.handLeave(request);

    }
}
