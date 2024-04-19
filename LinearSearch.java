public class LinearSearch
{
    public static int linearSearch(int[] arr, int n)
    {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n) return i;
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {5,4,1,3,2};
        System.out.println(linearSearch(arr, 3));
    }
}
