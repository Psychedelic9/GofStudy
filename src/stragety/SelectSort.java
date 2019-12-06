package stragety;

public class SelectSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        for (int i =0;i<array.length-1;i++){
            int min = i;
            for (int j =i+1;j<array.length;j++){
                if (array[min]>array[j]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
