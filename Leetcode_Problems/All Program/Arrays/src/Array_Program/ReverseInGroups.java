package Array_Program;

import java.util.Arrays;

public class ReverseInGroups
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int group = 3 ;
        reverseInGroups(arr,group);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseInGroups(int[] arr, int k)
    {
        for (int i = 0; i < arr.length ; i += k)
        {
            int start = i ;
            int end = i + k - 1 ;

            if (end >= arr.length) end = arr.length - 1;



            while (start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++ ;
                end-- ;
            }
        }
    }
}
