package iteratorPattern;

public class LeaveRequest {
    private int leaveDays;
    private String name;

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeaveRequest(int leaveDays, String name) {
        this.leaveDays = leaveDays;
        this.name = name;
    }
}
