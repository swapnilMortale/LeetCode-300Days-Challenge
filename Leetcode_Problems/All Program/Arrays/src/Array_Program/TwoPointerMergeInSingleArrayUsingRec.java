package Array_Program;

import java.util.Arrays;

public class TwoPointerMergeInSingleArrayUsingRec
{
    public static void main(String[] args)
    {
        int[] arr = {45, 12, 89, 3, 67, 23, 10, 56, 90, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array (Asending): " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end)
    {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end)
    {
        int[] ans = new int[arr.length];
        int i = start, j = mid + 1, k = start;

        while (i <= mid && j <= end)
        {
            ans[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++]; // As   ending order
        }

        while (i <= mid) ans[k++] = arr[i++];
        while (j <= end) ans[k++] = arr[j++];

        for (int k2 = start; k2 <= end; k2++)
        {
            arr[k2] = ans[k2];
        }
    }
}
