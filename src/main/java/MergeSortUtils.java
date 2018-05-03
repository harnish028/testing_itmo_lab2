import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

public class MergeSortUtils {

    private static Random rnd = new Random();

    public static <E> void printArray(E[] array){
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <E> void printArray(String message, E[] array){
        System.out.print(message);
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static Integer[] generateArrayOfInteger(int countOfElements) {
        int[] arrayOfPrimitive = new int[countOfElements];
        for(int i = 0; i < countOfElements - 1; i++) {
            arrayOfPrimitive[i] = rnd.nextInt();
        }

        return ArrayUtils.toObject(arrayOfPrimitive);
    }
}
