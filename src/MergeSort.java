
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static final int DATA_SIZE = 40;    //Must be greater than 0
    private static Scanner scanner = new Scanner(System.in);
    private static int[] array = new int[DATA_SIZE];
    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < DATA_SIZE; i++) array[i] = random.nextInt(100);

        System.out.println("Before sorting:");
        for (int i = 0; i < DATA_SIZE; i++) System.out.print(array[i] + " ");

        split(0, DATA_SIZE - 1);

        System.out.println("\nAnd after sorting:");
        for (int i = 0; i < DATA_SIZE; i++) System.out.print(array[i] + " ");
    }

    private static void split(int begin, int end) {
        if (begin == end) return;
        int middle = begin + (end - begin) / 2;
        split(begin, middle);
        split(middle + 1, end);
        merge(begin, end);

    }

    private static void merge(int begin, int end) {
        int middle = begin + (end - begin) / 2;
        int[] tempArray1 = new int[middle - begin + 1];
        int[] tempArray2 = new int[end - middle];
        for (int i = 0; i < tempArray1.length; i++) tempArray1[i] = array[begin + i];
        for (int i = 0; i < tempArray2.length; i++) tempArray2[i] = array[middle + 1 + i];

        int i, j, k;
        i = j = 0;
        k = begin;

        while (i < tempArray1.length && j < tempArray2.length) {
            if (tempArray1[i] <= tempArray2[j]) {
                array[k] = tempArray1[i];
                i++;
            } else {
                array[k] = tempArray2[j];
                j++;
            }
            k++;
        }

        while(i < tempArray1.length){
            array[k] = tempArray1[i];
            i++;
            k++;
        }
        while(j < tempArray2.length){
            array[k] = tempArray2[j];
            j++;
            k++;
        }
    }
}
