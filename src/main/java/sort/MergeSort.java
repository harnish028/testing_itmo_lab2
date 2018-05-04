package sort;

public class MergeSort<E> {

    public <E extends Comparable<E>> void mergeSort(E[] arr, int left, int right) {

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException();
        }

        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private <E extends Comparable<E>> void merge(E[] arr, int left, int middle, int right) {
        Object[] buf = new Object[right - left + 1];
        int leftArr = left;
        int rightArr = middle + 1;
        int i = 0;
        int k = 0;

        while (leftArr <= middle && rightArr <= right) {
            if (arr[leftArr].compareTo(arr[rightArr]) == -1) {
                buf[i++] = arr[leftArr++];
            } else {
                buf[i++] = arr[rightArr++];
            }
        }

        if (leftArr > middle) {
            for (k = rightArr; k <= right; k++) {
                buf[i++] = arr[k];
            }
        } else {
            for (k = leftArr; k <= middle; k++) {
                buf[i++] = arr[k];
            }
        }

        for (k = 0; k < right - left + 1; k++) {
            arr[k + left] = (E) buf[k];
        }
    }
}
