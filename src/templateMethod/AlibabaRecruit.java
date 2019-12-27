package templateMethod;

public class AlibabaRecruit extends Recruit {
    @Override
    protected void interview() {
        System.out.println("面试：一面");
        System.out.println("面试：二面");
        System.out.println("面试：三面");
    }

    @Override
    protected void screeningResume() {
        System.out.println("简历筛选：要求985/211本科以上学历");
    }
}
