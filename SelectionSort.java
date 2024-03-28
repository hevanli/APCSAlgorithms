import java.util.Arrays;

public class SelectionSort
{
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {5,4,1,2,3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
