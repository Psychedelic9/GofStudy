package stragety;

public class User {
    public static void main(String[] args) {
         int[]array = {5,1,33,100,52,44,3};
        Sorter sort = new Sorter();
        QuickSort quickSort = new QuickSort();
        sort.setSortStrategy(quickSort);
        int[] arr = sort.sort(array);
        for (int s:arr){
            System.out.println(s);
        }
    }
}
