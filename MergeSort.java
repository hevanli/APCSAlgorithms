import java.util.Arrays;

public class MergeSort
{
    private static int[] merge(int[] arr1, int[] arr2)
    {
        int[] result = new int[arr1.length + arr2.length];
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
        //System.out.println(Arrays.toString(result));
        return result;
    }

    private static int[] mS(int[] arr)
    {
        if (arr.length == 1) return arr;

        int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        left = mS(left);
        right = mS(right);
        return merge(left, right);
    }

    public static void mergeSort(int[] arr)
    { 
        //System.out.println(Arrays.toString(mS(orig_arr)));
        //System.out.println(mS(orig_arr));
        //System.out.println(orig_arr);
        arr = mS(arr);
    }

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
