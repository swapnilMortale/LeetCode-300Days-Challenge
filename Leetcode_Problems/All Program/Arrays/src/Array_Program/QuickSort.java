package Array_Program;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr = {98, 23,53, 23 ,67,85,2,0 ,86,24,8} ;
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr , int start ,int end)
    {
        if (start < end)
        {
            int partitionPos = partition(arr, start ,end) ;

            quickSort(arr , start , partitionPos -1);
            quickSort(arr , partitionPos + 1 , end);
        }
    }

    public static int partition(int[] arr, int start, int end)
    {
        int reference = arr[start];  // reference
        int i = start;
        int j = end;

        while (i < j)
        {
            // Move i forward until an element > reference is found
            while (i <= end && arr[i] <= reference) i++;


            // Move j backward until an element <= reference is found
            while (j >= start && arr[j] > reference) j--;


            // Swap if i and j haven't crossed yet
            if (i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the reference in its correct sorted position
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;

        return j;
    }

}
