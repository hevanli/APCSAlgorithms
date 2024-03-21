import java.util.Arrays;

public class MergeSort
{
    private static void merge(int[] result, int[] arr1, int[] arr2)
    {
        int i = 0, ai = 0, bi = 0;
        while (i < result.length)
        {
            if (ai == arr1.length)
                result[i] = arr2[bi++];
            else if (bi == arr2.length)
                result[i] = arr1[ai++];
            else if (arr1[ai] <= arr2[bi])
                result[i] = arr1[ai++];
            else
                result[i] = arr2[bi++];
            i++;
        }
    }

    private static int[] mS(int[] arr)
    {
        if (arr.length == 1) return arr;

        int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        left = mS(left);
        right = mS(right);
        merge(arr, left, right);
        return arr;
    }

    public static void mergeSort(int[] arr)
    { arr = mS(arr); }

    public static void main(String[] args)
    {
        int[] test1 = {5,4,3,2,1};
        System.out.println("Before sorting: " + Arrays.toString(test1));
        mergeSort(test1);
        System.out.println("After sorting: " + Arrays.toString(test1));

        int[] test2 = {435,567,134,6756,1,45657};
        System.out.println("Before sorting: " + Arrays.toString(test2));
        mergeSort(test2);
        System.out.println("After sorting: " + Arrays.toString(test2));
    }
}
