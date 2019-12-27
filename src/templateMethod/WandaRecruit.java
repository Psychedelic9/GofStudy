package templateMethod;

public class WandaRecruit extends Recruit {
    @Override
    protected void writtenExamination() {
        //无笔试
    }

    @Override
    protected void screeningResume() {
        System.out.println("简历筛选：大专以上学历");
    }
}
