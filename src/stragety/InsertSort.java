package stragety;

public class InsertSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            if (i != j) {
                array[j] = temp;
            }
        }

        return array;
    }
}
