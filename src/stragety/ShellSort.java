package stragety;

public class ShellSort implements SortStrategy {
    @Override
    public int[] sort(int[] array) {
        if (array.length > 0) {
            int len = array.length;
            int gap = len / 2;
            while (gap > 0) {
                for (int i = gap; i < len; i++) {
                    int temp = array[i];
                    int index = i - gap;
                    while (index >= 0 && array[index] > temp) {
                        array[index + gap] = array[index];
                        index -= gap;
                    }
                    array[index + gap] = temp;
                }
                gap /= 2;
            }
        }
        return array;
    }
}
