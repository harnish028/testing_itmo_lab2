import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import sort.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void sortArrayWith5000000RandomIntegerElements() {
        Integer[] actualArray = MergeSortUtils.generateArrayOfInteger(5000000);

        Integer[] expectedArray = ArrayUtils.clone(actualArray);
        Arrays.sort(expectedArray);

        mergeSort.mergeSort(actualArray, 0, actualArray.length - 1);

        assertArrayEquals("Sorting not working correctly", actualArray, expectedArray);
    }

    @Test
    public void sortArrayWith10IntegerElements() {
        Integer[] expectedArray = new Integer[]{-7, -3, -2, 0, 1, 3, 5, 6, 9, 10};

        Integer[] actualArray = new Integer[]{-3, 5, 1, 6, 0, -7, -2, 3, 9, 10};

        MergeSortUtils.printArray("ArrayWith10IntegerElements before sort: ", actualArray);
        mergeSort.mergeSort(actualArray, 0, actualArray.length - 1);
        MergeSortUtils.printArray("ArrayWith10IntegerElements after sort: ", actualArray);

        assertArrayEquals("Sorting not working correctly", expectedArray, actualArray);
    }

    @Test
    public void sortArrayWith10DoubleElements() {
        Double[] expectedArray = new Double[]{-3.2, -1.1, 0.0, 1.7, 2.2, 3.3, 4.4, 5.0, 5.5};

        Double[] actualArray = new Double[]{5.5, 4.4, 3.3, -1.1, 0.0, 2.2, 5.0, 1.7, -3.2};

        MergeSortUtils.printArray("ArrayWith10DoubleElements before sort: ", actualArray);
        mergeSort.mergeSort(actualArray , 0, actualArray .length - 1);
        MergeSortUtils.printArray("ArrayWith10DoubleElements after sort: ", actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void sortArrayWithNull() {
        mergeSort.mergeSort(null, 0, 0);
    }

    @Test(expected = java.lang.ClassCastException.class)
    public void sortArrayWithNotComparableObjects() {
        Object[] actualArray =  new Object[]{new Integer(3), "as", new Scanner(System.in)};

        mergeSort.mergeSort((Comparable[]) actualArray, 0, actualArray.length - 1);
    }
}
