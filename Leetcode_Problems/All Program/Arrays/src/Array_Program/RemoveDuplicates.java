package Array_Program;

import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int arr1[] = {10,20,30,40,50,60,70,78,82};
        int arr2[] = {100,99,10,50,78};

        System.out.println(Arrays.toString(removeDuplicateOccoures(arr1, arr2)));
    }

    public static int[] removeDuplicateOccoures(int arr1[], int arr2[])
    {

        boolean remove[] = new boolean[arr1.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    remove[i] = true;
                    count++;
                    break;
                }
            }
        }
        int[] result = new int[arr1.length - count];;
        for (int i = 0, j= 0; i < arr1.length; i++)
        {
            if (!remove[i])
            {
                result[j] = arr1[i] ;
                j++ ;
            }
        }
        return result ;
    }
}
