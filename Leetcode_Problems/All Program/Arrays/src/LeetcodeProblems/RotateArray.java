package LeetcodeProblems;

import java.util.Arrays;

public class RotateArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        RotateRightShift(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void RotateRightShift(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n; // in case k > n

        for (int i = 0; i < k; i++)
        {
            int last = arr[n - 1]; // store last element
            for (int j = n - 1; j > 0; j--)
            {
                arr[j] = arr[j - 1]; // shift elements right
            }
            arr[0] = last; // put last element at the front
        }
    }
}
