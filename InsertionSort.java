import java.util.Arrays;

public class InsertionSort
{
    public static void insertionSort(int[] arr)
    {
        int curIdx, temp;

        for (int i = 1; i < arr.length; i++)
        {
            curIdx = i;
            while (curIdx > 0 && arr[curIdx] < arr[curIdx-1])
            {
                temp = arr[curIdx-1];
                arr[curIdx-1] = arr[curIdx];
                arr[curIdx] = temp;
                curIdx--;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] test = {4,3,2,1};
        System.out.println("Before Insertion Sort: " + Arrays.toString(test));
        insertionSort(test);
        System.out.println("Before Insertion Sort: " + Arrays.toString(test));
    }
}
