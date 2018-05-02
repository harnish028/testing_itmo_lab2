import org.junit.Test;
import sort.MergeSort;

public class MergeSortTest {

    MergeSort mergeSort = new MergeSort();

    @Test
    public void sortArrayOfInteger() {
        Integer[] array = MergeSortUtils.generateArrayOfInteger(10);
        MergeSortUtils.printArray(array);
        mergeSort.mergeSort(array, 0, array.length - 1);
        MergeSortUtils.printArray(array);
    }

    @Test
    public void sortArrayOfCharacter() {
        Character[] array = new Character[]{'b', 'a', 'c', 'd'};
        MergeSortUtils.printArray(array);
        mergeSort.mergeSort(array, 0, array.length - 1);
        MergeSortUtils.printArray(array);
    }

    @Test
    public void sortArrayOfDouble() {
        Double[] array = new Double[]{5.5, 4.4, 3.3, -1.1, 0.0, 2.2, 5.0, 1.7, -3.2};
        MergeSortUtils.printArray(array);
        mergeSort.mergeSort(array, 0, array.length - 1);
        MergeSortUtils.printArray(array);
    }
}
