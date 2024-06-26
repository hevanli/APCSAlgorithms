import java.util.Random;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        int[] arr1 = new Random().ints(100000, 0, 100000).toArray();
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        long startTime, endTime, totalTime;

        startTime = System.nanoTime();
        QuickSort.quickSort(arr1, 0, arr1.length - 1);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1000;
        System.out.println("Quick Sort took " + totalTime + " milliseconds");

        startTime = System.nanoTime();
        MergeSort.mergeSort(arr2);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1000;
        System.out.println("Merge Sort took " + totalTime + " milliseconds");

        startTime = System.nanoTime();
        SelectionSort.selectionSort(arr3);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime) / 1000;
        System.out.println("Selection Sort took " + totalTime + " milliseconds");
    }
}
