public class BinarySearch
{
    public static int binarySearch(int[] arr, int val)
    {
        int low = 0, high = arr.length - 1;
        int guess = (low + high) / 2, guessVal = arr[guess];
        while (low != high)
        {
            if (guessVal == val) return guess;
            else if (guessVal < val) low = guess + 1;
            else if (guessVal > val) high = guess - 1;

            guess = (low + high) / 2;
            guessVal = arr[guess];
        }
        return guessVal == val ? guess : -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int n = 5;
        System.out.println(n+" is at index "+binarySearch(arr, n)+" of the array");
        n = 1;
        System.out.println(n+" is at index "+binarySearch(arr, n)+" of the array");
        n = 3;
        System.out.println(n+" is at index "+binarySearch(arr, n)+" of the array");
    }
}
