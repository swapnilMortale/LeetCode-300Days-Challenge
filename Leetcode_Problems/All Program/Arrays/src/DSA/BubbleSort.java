package DSA;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {-876, -97, -55, 9, 4, 4, 545, 6, 67, 87, 8, 22, 9, -9, -9, -8, -1, 4, 6, 7, 68, 80};

        System.out.println("Before sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)    // outer loop
        {
            for (int j = 0; j < arr.length - 1 - i; j++)   // inner loop
            {
                boolean swap = false ;
                if (arr[j] > arr[j + 1])
                {
                    // Swap without temp variable (using addition/subtraction)
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    swap = true ;
                }
                if (!swap)
                    break;
            }
        }
    }
}
