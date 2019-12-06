package stragety;

public class User {
    SortStrategy mStrategy;

    public void setmStrategy(SortStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int[] sortResult(int[] array){
        return mStrategy.sort(array);
    }

    public static void main(String[] args) {
         int[]array = {5,1,33,100,52,44,3};
        User user = new User();
        user.setmStrategy(new InsertSort());
        int[] sort = user.sortResult(array);

        for (int s:sort){
            System.out.println(s);
        }
    }
}
