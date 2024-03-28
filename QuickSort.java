import java.util.Random;
import java.util.Arrays;

public class QuickSort
{
    public static void quickSort(int[] arr, int start, int end)
    {
        if (end <= start) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int i = start - 1; 

        for (int j = start; j < end; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static void main(String[] args)
    {
        int[] arr1 = new Random().ints(100, 0, 100).toArray();
        int[] arr2 = arr1.clone();
        
        System.out.println("Before Sort: " + Arrays.toString(arr1));
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println("After Sort: " + Arrays.toString(arr1));
    }
}
