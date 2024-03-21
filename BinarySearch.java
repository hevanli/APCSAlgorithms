import java.util.Arrays;

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

    public static int recBS(int[] arr, int val)
    {
        int guess = arr.length/2, guessVal = arr[guess];
        
        if (guessVal == val) 
            return guess;
        else if (guessVal < val) 
            return guess + recBS(Arrays.copyOfRange(arr, guess+1, arr.length), val) + 1;
        else 
            return recBS(Arrays.copyOfRange(arr, 0, guess), val);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};

        // Regular Binary Search
        System.out.println("--Testing Regular Binary Search--");
        int n = 5;
        System.out.println(n+" is at index "+binarySearch(arr, n)+" of the array");
        n = 1;
        System.out.println(n+" is at index "+binarySearch(arr, n)+" of the array");
        n = 3;
        System.out.println(n+" is at index "+binarySearch(arr, n)+" of the array");

        // Recursive Binary Search
        System.out.println("\n--Testing Recursive Binary Search--");
        n = 3;
        System.out.println(n+" is at index "+recBS(arr, n)+" of the array");
    }
}
