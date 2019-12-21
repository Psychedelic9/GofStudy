package stragety;

public class Sorter {
    SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] array){
        return sortStrategy.sort(array);
    }
}
