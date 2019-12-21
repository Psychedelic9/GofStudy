package stragety;

public class QuickSort implements SortStrategy {
    public static int[] quickSort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=quickSort(arr,start,i-1);
        if (j+1<end) arr=quickSort(arr,j+1,end);
        return (arr);
    }
    @Override
    public int[] sort(int[] array) {
        int[] arr = quickSort(array, 0, array.length-1);
        return arr;
    }
}
