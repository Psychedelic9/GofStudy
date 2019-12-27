package templateMethod;

public abstract class Recruit {
    protected void screeningResume(){
        System.out.println("筛选简历");
    }
    protected void writtenExamination(){
        System.out.println("笔试");
    }
    protected void interview(){
        System.out.println("面试");
    }
    protected void entry(){
        System.out.println("入职");
    }

    public void recruit(){
        screeningResume();
        writtenExamination();
        interview();
        entry();
    }

}
