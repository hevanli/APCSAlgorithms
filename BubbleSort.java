import java.util.Arrays;

class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i+1] < arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }

        if (swapped) bubbleSort(arr);
    }

    public static void main(String[] args)
    {
        int[] arr = {4, 3, 7, 8, 12, 1};
        System.out.println("Before Bubble Sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Bubble Sort: " + Arrays.toString(arr));
    }
}
