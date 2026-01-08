package DSA;

import java.util.Arrays;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {-1, 4, 6, -97, -55, -8, -876, 7, 68, 80, -9, -9};

        bubbleSortAscending(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int result = binarySearch(arr, -9);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    // Bubble sort to make array sorted for binary search
    public static void bubbleSortAscending(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid; // found

            if (arr[mid] < target)
                start = mid + 1; //  search right half
            else
                end = mid - 1;   //  search left half
        }

        return -1; // not found
    }
}
