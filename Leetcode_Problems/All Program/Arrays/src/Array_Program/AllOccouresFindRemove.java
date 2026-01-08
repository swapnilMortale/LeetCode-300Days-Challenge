package Array_Program;

import java.util.Arrays;

public class AllOccouresFindRemove
{

    public static void main(String[] args)
    {
        int arr[] = {1, 3, 3, 90, 90, 90, 90, 90, 39, 2, 4, 57, 68, 79, 8, 65, 65, 90, 987, 90, 98, 856, 78, 789, 8789, 87, 70, 988, 869, 87, 987};
        System.out.println(Arrays.toString(RemoveAllOccer(arr, 90)));
    }

    public static int[] RemoveAllOccer(int[] arr, int value)
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == value) {
                count++;
            }
        }

        if (count > 0) {
            int[] ans = new int[arr.length - count];
            int j = 0;

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] != value)
                {
                    ans[j++] = arr[i];
                }
            }
            return ans;
        }

        return arr;
    }
}
