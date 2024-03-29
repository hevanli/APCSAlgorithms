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
        int temp;

        for (int j = start; j < end; j++)
        {
            if (arr[j] < pivot)
            {
                temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[++i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
