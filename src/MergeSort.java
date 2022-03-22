import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] array = new int[100];
    private static Random random = new Random();

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++)array[i] = random.nextInt(100);

        System.out.println("Before sorting:");
        for(int i = 0; i < 100; i++) System.out.print(array[i]+" ");


    }

    private static void split(int begin, int end){
        if(begin == end) return;
            int middle = begin + (end - begin) / 2;
            split(begin, middle);
            split(middle + 1, end);



    }

    private static void merge(int begin, int middle, int end){
        int[] tempArray1 = new int[middle - begin + 1];
        int[] tempArray2 = new int[end - middle];
        for(int i = begin, ; i <= end; i++,j++)tempArray1[j] = array[i];
    }

}
